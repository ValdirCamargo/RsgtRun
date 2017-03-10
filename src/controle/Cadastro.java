/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.math.BigInteger;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

/**
 *
 * @author Valdir
 */
public class Cadastro {
    
    static private Session ses = HibernateUtil.getSessionFactory().openSession();
    
    //Metodo para salvar insets ou updates dos objetos da base de dados.
    public void salvar(Object obj){
        Transaction tr = ses.beginTransaction();
        ses.saveOrUpdate(obj);
        tr.commit();
    }   
    
    //Metodo para chamar procedure que da upadate no inicio da corrida simultaneo a todos corredores.
    public void chama(){    
        Transaction tr = ses.beginTransaction();
        BigInteger x = (BigInteger)ses.createSQLQuery("call largada1()").uniqueResult();
        tr.commit();
        JOptionPane.showMessageDialog(null,"A Corrida iniciou");
    }
    
    //Metodo para chamar procedure que recebe idTag do corredor e da update em seu tempo de chegada e tempo de corrida.
     public void fim(String strin){    
        Transaction tr = ses.beginTransaction();
        BigInteger x = (BigInteger)ses.createSQLQuery("call chegada(:parametro)").setString("parametro",strin).uniqueResult();
        tr.commit();
      }
    
    //Metodo para consultar todos os dados de uma determinada tabela, porém sem restrições.
     public List consultaTodos(Class classe){
        return ses.createCriteria(classe).addOrder(Order.asc("nome")).list();
     } 
    
     //Metodo para consultar todos os dados de uma determinada tabela, porém sem restrições.
     public List consultaObjetos(Class classe, Criterion... criterio){
        Criteria cr = ses.createCriteria(classe);
        
        for(int i = 0; i < criterio.length; i++){
            cr = cr.add(criterio[i]);
        }
        return cr.list();
     }
    
     //Metodo para consultar todos os dados de uma determinada tabela, porém sem restrições.
     public Object consultaObjeto(Class classe, Criterion... criterio){
        Criteria cr = ses.createCriteria(classe);
        
        for(int i = 0; i < criterio.length; i++){
            cr = cr.add(criterio[i]);
        }
        return cr.uniqueResult();        
     }
    
}
