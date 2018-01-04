/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;
import javax.swing.JOptionPane;
import entidades.SerialRxTx;
import entidades.Competidor;
import controle.Controle;
import entidades.EventoRfid;
import entidades.EventoRfid.EventoRfidListener;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Valdir Camargo
 */
public class Principal extends javax.swing.JFrame {
    
    private SerialRxTx test = new SerialRxTx();//objeto que inicia a conexao com porta COM
    private Competidor competidor = new Competidor();//objeto de gestao de competidor
    private final Controle con = new Controle();
    private LinkedList<Competidor> listaCompetidores = new LinkedList<>();
    private boolean novo = false;
    private Date horario;    
        
    public Principal() {        
        initComponents();
        this.setLocationRelativeTo(null);
       
        jLabel9.setForeground(Color.red);
        jLabel9.setText("Desconectado");
        
        //Botoes desabilitados ate que a porta com seja conectada
        btDesconectar.setEnabled(false);
        btSalvar.setEnabled(false);
        btConectar.setEnabled(true);
        btSalvar.setEnabled(false);
        btTelaLargada.setEnabled(false);
        
        //TextFiled desabilitados ate que a porta com seja conectada
        cbCategoria.setEnabled(false);
        cbNome.setEnabled(false);
        tEmail.setEnabled(false);
        tNome.setEnabled(false);
        tNumberPlay.setEnabled(false);
        tTelefone.setEnabled(false);
        tUidTag.setEnabled(false);
        
        listaCompetidores.addAll(con.consultarCompetidores());
        cbNome.setModel(new DefaultComboBoxModel(listaCompetidores.toArray()));
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tNumberPlay = new javax.swing.JTextField();
        tUidTag = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbNome = new javax.swing.JComboBox<>();
        tTelefone = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btConectar = new javax.swing.JButton();
        btDesconectar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbCom = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btTelaLargada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Validacao de Competidor");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jLabel5.setText("Desenvolvido por: ");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("RSGT");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Solucoes Tecnologicas");

        jLabel8.setText("Versao: 1.0.0");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("COMPETIDOR:");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("NUMBER PLAYT: ");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("NUMBER TAG: ");

        tNumberPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumberPlayActionPerformed(evt);
            }
        });

        tUidTag.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        tUidTag.setForeground(new java.awt.Color(153, 153, 153));
        tUidTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUidTagActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculina", "Feminina", "Mista" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("CATEGORIA");

        cbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNomeItemStateChanged(evt);
            }
        });
        cbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeActionPerformed(evt);
            }
        });

        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("TELEFONE :");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("E-MAIL:");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("NOME: ");

        btSalvar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btConectar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btConectar.setText("Conectar");
        btConectar.setPreferredSize(new java.awt.Dimension(98, 28));
        btConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConectarActionPerformed(evt);
            }
        });

        btDesconectar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btDesconectar.setText("Desconectar");
        btDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesconectarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("PORTA:");

        cbCom.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cbCom.setForeground(new java.awt.Color(51, 51, 51));
        cbCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM10" }));
        cbCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("STATUS: ");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(cbCom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cbCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDesconectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        btTelaLargada.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btTelaLargada.setText("Tela de Largada");
        btTelaLargada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaLargadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTelaLargada)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(btTelaLargada)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(178, 178, 178))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNumberPlay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tUidTag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbNome))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tNome)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCategoria)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(tEmail))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(tTelefone))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(tNumberPlay))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tUidTag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTelaLargadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaLargadaActionPerformed

        test.close();
        //        try {
            //            Thread.sleep(1000);
            //        } catch (InterruptedException ex) {
            //            Logger.getLogger(ControleLargada.class.getName()).log(Level.SEVERE, null, ex);
            //        }
        this.dispose();
        String serialPort = (String) cbCom.getSelectedItem();
        new ControleLargada(serialPort).setVisible(true);
    }//GEN-LAST:event_btTelaLargadaActionPerformed

    private void btDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesconectarActionPerformed

        test.close();//Fecha a conexao com a porta COM
        jLabel9.setForeground(Color.red);
        jLabel9.setText("Desconectado");
        tUidTag.setText("");
        btConectar.setEnabled(true);
        btDesconectar.setEnabled(false);
        btSalvar.setEnabled(false);
        JOptionPane.showMessageDialog(null,
            "Porta :  "+test.getSerialPortName()+" Desconectada.",
            "Saindo.", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btDesconectarActionPerformed

    private void btConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectarActionPerformed
        if(test.iniciaSerial()){
            test.addEventoRfidListener(new EventoRfidListener(){
                public void novaLeituraRfid(EventoRfid e){
                    Competidor competidor = e.getCompetidor();

                    if ( tUidTag.getText().trim().equals("") ) {
                        tUidTag.setText("Aproxime a TAG Rfid do Leitor");
                        tUidTag.setText(competidor.getIdTag()); //Ajuste os nomes das variáveis

                    }else {
                        btSalvar.setEnabled(false);
                        JOptionPane.showMessageDialog(null,
                            "Este Competidor ja retirou seu kit.",
                            "Competidor ja Validado.", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            });

            jLabel9.setForeground(Color.green);
            jLabel9.setText("Conectado");
            tUidTag.setText("Aproxime a TAG Rfid do Leitor");

            //Habilita os Botoes desabilitados ate que a porta com seja conectada
            btConectar.setEnabled(false);
            btDesconectar.setEnabled(true);
            btSalvar.setEnabled(true);
            btConectar.setEnabled(false);
            btTelaLargada.setEnabled(true);

            //Habilita os TextFiled desabilitados ate que a porta com seja conectada
            cbCategoria.setEnabled(true);
            cbNome.setEnabled(true);
            tEmail.setEnabled(true);
            tNome.setEnabled(true);
            tNumberPlay.setEnabled(true);
            tTelefone.setEnabled(true);
            tUidTag.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null,
                "Erro ao conectar, porta:  "+test.getSerialPortName()+".",
                "Erro ao conectar.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btConectarActionPerformed

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void cbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNomeActionPerformed

    private void cbNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNomeItemStateChanged
        // TODO add your handling code here:

        if(evt.getStateChange()==ItemEvent.SELECTED){
            Competidor competidor = (Competidor) cbNome.getSelectedItem();
            tNome.setText(competidor.getNome());
            tNumberPlay.setText(competidor.getNumberPlay());
            tUidTag.setText(competidor.getIdTag());
            tEmail.setText(competidor.getEmail());
            tTelefone.setText(competidor.getTelefone());
            cbCategoria.setSelectedItem(competidor.getCategoria());

            btSalvar.setEnabled(true);
            

            novo = false;

        }
    }//GEN-LAST:event_cbNomeItemStateChanged

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        competidor = new Competidor();
        if(novo){
            competidor = new Competidor();
        }else{
            competidor = (Competidor) cbNome.getSelectedItem();
        }

        String nome =(String) (tNome.getText());
        String number = (tNumberPlay.getText());
        String texto = (tUidTag.getText());
        String categ = (String) (cbCategoria.getSelectedItem());
        horario = new Date();

        competidor.setNome(nome);
        competidor.setEmail(tEmail.getText());
        competidor.setTelefone(tTelefone.getText());
        competidor.setCategoria(categ);
        competidor.setNumberPlay(number);
        competidor.setIdTag(texto);
        competidor.setHorario(horario);
        con.salvarCompetidor(competidor);

        if(novo){
            listaCompetidores.add(competidor);
            cbNome.addItem(competidor);
            cbNome.setSelectedItem(competidor);
        }
        

        JOptionPane.showMessageDialog(null,
            "Tag Rfid Cadastrada com Sucesso...  "
            ,"Parabens!!!", JOptionPane.INFORMATION_MESSAGE);
        tNumberPlay.setText("");
        tUidTag.setText("Aproxime a Tag Rfid");

    }//GEN-LAST:event_btSalvarActionPerformed

    private void tUidTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUidTagActionPerformed

    }//GEN-LAST:event_tUidTagActionPerformed

    private void tNumberPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumberPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumberPlayActionPerformed

    private void cbComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComActionPerformed
        String serialPort = (String) cbCom.getSelectedItem();
        test.serialPortName = serialPort;
    }//GEN-LAST:event_cbComActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConectar;
    private javax.swing.JButton btDesconectar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTelaLargada;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCom;
    private javax.swing.JComboBox<Object> cbNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNumberPlay;
    private javax.swing.JTextField tTelefone;
    private javax.swing.JTextField tUidTag;
    // End of variables declaration//GEN-END:variables
}


