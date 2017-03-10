/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Valdir
 */
@Entity
@Table(name = "competidor", catalog = "rsgtrun_bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Competidor.findAll", query = "SELECT c FROM Competidor c")
    , @NamedQuery(name = "Competidor.findByCodCompetidor", query = "SELECT c FROM Competidor c WHERE c.codCompetidor = :codCompetidor")
    , @NamedQuery(name = "Competidor.findByNome", query = "SELECT c FROM Competidor c WHERE c.nome = :nome")
    , @NamedQuery(name = "Competidor.findByCategoria", query = "SELECT c FROM Competidor c WHERE c.categoria = :categoria")
    , @NamedQuery(name = "Competidor.findByTelefone", query = "SELECT c FROM Competidor c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Competidor.findByEmail", query = "SELECT c FROM Competidor c WHERE c.email = :email")
    , @NamedQuery(name = "Competidor.findByNumberPlay", query = "SELECT c FROM Competidor c WHERE c.numberPlay = :numberPlay")
    , @NamedQuery(name = "Competidor.findByIdTag", query = "SELECT c FROM Competidor c WHERE c.idTag = :idTag")
    , @NamedQuery(name = "Competidor.findByHorario", query = "SELECT c FROM Competidor c WHERE c.horario = :horario")
    , @NamedQuery(name = "Competidor.findByLargada", query = "SELECT c FROM Competidor c WHERE c.largada = :largada")
    , @NamedQuery(name = "Competidor.findByChegada", query = "SELECT c FROM Competidor c WHERE c.chegada = :chegada")
    , @NamedQuery(name = "Competidor.findByTempoCorrida", query = "SELECT c FROM Competidor c WHERE c.tempoCorrida = :tempoCorrida")})
public class Competidor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codCompetidor")
    private Integer codCompetidor;
    @Column(name = "nome")
    private String nome;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "number_play")
    private String numberPlay;
    @Column(name = "idTag")
    private String idTag;
    @Column(name = "horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;
    @Column(name = "largada")
    @Temporal(TemporalType.TIME)
    private Date largada;
    @Column(name = "chegada")
    @Temporal(TemporalType.TIME)
    private Date chegada;
    @Column(name = "tempo_corrida")
    @Temporal(TemporalType.TIME)
    private Date tempoCorrida;

    public Competidor() {
    }

    public Competidor(Integer codCompetidor) {
        this.codCompetidor = codCompetidor;
    }

    public Integer getCodCompetidor() {
        return codCompetidor;
    }

    public void setCodCompetidor(Integer codCompetidor) {
        Integer oldCodCompetidor = this.codCompetidor;
        this.codCompetidor = codCompetidor;
        changeSupport.firePropertyChange("codCompetidor", oldCodCompetidor, codCompetidor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getNumberPlay() {
        return numberPlay;
    }

    public void setNumberPlay(String numberPlay) {
        String oldNumberPlay = this.numberPlay;
        this.numberPlay = numberPlay;
        changeSupport.firePropertyChange("numberPlay", oldNumberPlay, numberPlay);
    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        String oldIdTag = this.idTag;
        this.idTag = idTag;
        changeSupport.firePropertyChange("idTag", oldIdTag, idTag);
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        Date oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    public Date getLargada() {
        return largada;
    }

    public void setLargada(Date largada) {
        Date oldLargada = this.largada;
        this.largada = largada;
        changeSupport.firePropertyChange("largada", oldLargada, largada);
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        Date oldChegada = this.chegada;
        this.chegada = chegada;
        changeSupport.firePropertyChange("chegada", oldChegada, chegada);
    }

    public Date getTempoCorrida() {
        return tempoCorrida;
    }

    public void setTempoCorrida(Date tempoCorrida) {
        Date oldTempoCorrida = this.tempoCorrida;
        this.tempoCorrida = tempoCorrida;
        changeSupport.firePropertyChange("tempoCorrida", oldTempoCorrida, tempoCorrida);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCompetidor != null ? codCompetidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competidor)) {
            return false;
        }
        Competidor other = (Competidor) object;
        if ((this.codCompetidor == null && other.codCompetidor != null) || (this.codCompetidor != null && !this.codCompetidor.equals(other.codCompetidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "janelas.Competidor[ codCompetidor=" + codCompetidor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
