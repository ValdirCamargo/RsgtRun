/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidades.Competidor;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Valdir
 */
public class Controle {
   
    private final Cadastro cad = new Cadastro();

    //Entidade Competidor
    //Metodo para salvar Competidor
    public void salvarCompetidor(Competidor comp) {
        cad.salvar(comp);
    }
    
    //Metodo para consultar todos os Competidores Cadastrados, sem restrições.
    public List consultarCompetidores() {
        return cad.consultaTodos(Competidor.class);
    }
        
    //Metodo para consultar todos os Competidores Cadastrados com nome parecido com o parametro Nome.
    public List consultarCompetidoresNome(String nome) {
        return cad.consultaObjetos(Competidor.class, Restrictions.like("nome", nome));
    }
    
    //Metodo para consultar todos os Competidores Cadastrados com codCompetidor igual com o parametro codigo.
    public List consultarCompetidoresCod(int codigo) {
        return cad.consultaObjetos(Competidor.class, Restrictions.like("codCompetidor", codigo));
    }
    
    
}
