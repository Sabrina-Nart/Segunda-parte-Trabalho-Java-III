
package abstratas;

import java.util.List;
import javax.persistence.Query;

abstract public class dao<T> {
    
    public void create(T objeto) {
        
        Dados.getManager().getTransaction().begin(); 
        Dados.getManager().persist(objeto);
        Dados.getManager().getTransaction().commit(); 
    }
    
//////////////////
    
    public void update(T objeto) {
        
        Dados.getManager().getTransaction().begin();
        Dados.getManager().merge(objeto);
        Dados.getManager().getTransaction().commit(); 
    }
    
//////////////////
    
    public void delete(T objeto) {
        
        Dados.getManager().getTransaction().begin();
        Dados.getManager().remove(objeto);
        Dados.getManager().getTransaction().commit();
    }
    
//////////////////

    public T read(Class<T> classToRerurn, int id){ 
        
        return Dados.getManager().find(classToRerurn, id);
    }
    
//////////////////    

    public List<T> read(String JQPL) {
        
        Query query = Dados.getManager().createQuery(JQPL);
        return query.getResultList();
    }
    
//////////////////  

     public List<T> read(String JQPL, Object... args) {
        
        Query query = Dados.getManager().createQuery(JQPL); 
        
        for (int i=0; i<args.length; i++){ 
            
            query.setParameter(i+1, args[i]);
        }
        
        return query.getResultList(); 
    }  
     
//////////////////      
}
