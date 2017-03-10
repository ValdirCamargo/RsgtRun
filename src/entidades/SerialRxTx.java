package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import controle.Controle;
import entidades.EventoRfid;
import entidades.EventoRfid.EventoRfidListener;
import entidades.Competidor;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;



/**
 *
 * @author Valdir
 */
public class SerialRxTx implements SerialPortEventListener{
    
     private ArrayList<EventoRfidListener> objListeners = new ArrayList<>();

    synchronized public void addEventoRfidListener(EventoRfidListener listener) {
        objListeners.add(listener);
    }

    synchronized public void removeEventoRfidListener(EventoRfidListener listener) {
        objListeners.remove(listener);
    }

    synchronized protected void fireNovaLeitura(Competidor competidor ) {
        Iterator<EventoRfidListener> ite = objListeners.iterator();
        while (ite.hasNext()) {
            ite.next().novaLeituraRfid(new EventoRfid(this, competidor));
        }
    }

    SerialPort serialPort = null;
    
    Competidor competidor = new Competidor();//objeto de gestao de competidor
    private final Controle con = new Controle();
    private Date horario;
    private Date largada = new Date(System.currentTimeMillis());
   
        
    private String appName;//Nome da aplicacaco
    
    private BufferedReader input;//objeto para leitura da serial
    private OutputStream output;//objeto para escrita na serial
    
    private static final int TIME_OUT = 1000;//Tempo de Espera da  comunicacao
    private static  int DATA_RATE = 9600;//Velocidade da comunicacao
    
    public String serialPortName;
    
    public boolean iniciaSerial(){
        boolean status = false;
        try {
            //Descobre e obtem as portas seriais do sistema
            CommPortIdentifier portId = null;
            Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
            
            while(portId == null && portEnum.hasMoreElements()){
                CommPortIdentifier currPortId = (CommPortIdentifier)portEnum.nextElement();
                
               
                if(currPortId.getName().equals(serialPortName) || currPortId.getName().startsWith(serialPortName)){
                    serialPort = (SerialPort) currPortId.open(appName, TIME_OUT);
                    portId = currPortId;
                    System.out.println("Conectado a Porta: "+ currPortId.getName());
                    break;
                }
            }
            if (portId == null || serialPort == null) {
                return false;
            }
            serialPort.setSerialPortParams(DATA_RATE,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
            status = true;
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               e.printStackTrace();
            }
            //se der certo retorna true
                      
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        }
            //Se nao deu certo retorna false
            return status;
    }
    
    //Metodo para enviar dados pela porta Serial
    public void sendData(String data){
        try {
            output = serialPort.getOutputStream();
            output.write(data.getBytes());
        } catch (Exception e) {
            System.err.println(e.toString());
            //Posso exibir uma msg aqui
        }    
    }
    
    //Metodo que fecha a porta Serial
    public  synchronized void close()
    {
        if (serialPort != null) 
        {
             serialPort.removeEventListener();
             serialPort.close();
        }
        
    }
            
    
    @Override
    public void serialEvent(SerialPortEvent spe) 
    {
        //Metodo que trata a chegada de dados da serial para o computador.
        try 
        {
            switch(spe.getEventType())
            {
                case SerialPortEvent.DATA_AVAILABLE:
                    if (input == null) 
                    {
                        input = new BufferedReader(
                                new InputStreamReader(
                                        serialPort.getInputStream()));
                    }
                    if(input.ready())// verifica se o buffer esta limpo para trabalho.
                    {    
                        competidor = new Competidor();
                        horario = new Date();   
                        largada = new Date();
                        String UidTag = input.readLine();

                        //Vetor de String que irá dividir a String linha de dados em dados distintos
                        String tag = UidTag;
                        competidor.setIdTag(tag);
                        competidor.setHorario(horario);
                        competidor.setLargada(largada);

                        fireNovaLeitura(competidor);
                        //con.salvarCompetidor(competidor);
                    
                    }
                    break;
                    
                default:
                    break;
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
            
        }
        
    }

    public Competidor getCompetidor() {
        return competidor;
    }

    public void setCompetidor(Competidor competidor) {
        this.competidor = competidor;
    }

    public static int getDATA_RATE() {
        return DATA_RATE;
    }

    public static void setDATA_RATE(int DATA_RATE) {
        SerialRxTx.DATA_RATE = DATA_RATE;
    }

    public String getSerialPortName() {
        return serialPortName;
    }

    public void setSerialPortName(String serialPortName) {
        this.serialPortName = serialPortName;
    }
    
    
    
}
