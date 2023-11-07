
package controller;

import abstratas.dao;
import java.util.List;
import model.Cliente;
import model.ReservaTraje;
import model.Vestidos;

public class daoReservaTraje extends dao<ReservaTraje>{
    
    public List<ReservaTraje> read(){
        
        return super.read("select e from ReservaTraje e");
    }
    
/////////////////////    
    
    public List<ReservaTraje> read (Cliente cliente){
        
         String JPQL="select e from ReservaTraje e where e.cliente =?1" + " order by e.dataLocacao";
    
         return super.read(JPQL, cliente);
    }    
    
/////////////////////    
    
    public List<ReservaTraje> read (Vestidos vestidos){
        
         String JPQL="select e from ReservaTraje e where e.vestidos =?1" + " order by e.dataLocacao";
    
         return super.read(JPQL, vestidos);
    }
    
/////////////////////     
}
