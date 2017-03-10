/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.EventListener;
import java.util.EventObject;

/**
 *
 * @author Valdir
 */
public class EventoRfid extends EventObject {
    
    private Competidor competidor;

    public EventoRfid (Object source, Competidor competidor) {
        super(source);
        this.competidor= competidor;
    }

    public Competidor getCompetidor () {
        return competidor;
    }

    public void setCompetidor (Competidor competidor) {
        this.competidor= competidor;
    }
    public interface EventoRfidListener extends EventListener {

      public void novaLeituraRfid(EventoRfid e);
    }
    
}
