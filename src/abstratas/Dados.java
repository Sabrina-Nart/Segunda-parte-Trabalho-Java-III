
package abstratas;

import javax.persistence.EntityManager; //SEMPRE DESSE IMPORT
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

abstract public class Dados {
    
    private static EntityManager manager = null;
    
////////////////
    
    public static EntityManager getManager(){
        
        if (manager == null){
            
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("trabalhoLocacao"); 
            
            manager = factory.createEntityManager();
        }
        
        return manager;
    }
    
////////////////     
}
