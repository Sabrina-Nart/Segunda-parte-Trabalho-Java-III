
package controller;

import abstratas.dao;
import enums.Sexo;
import java.util.List;
import model.Cliente;

public class daoCliente extends dao<Cliente>{
    
    public List<Cliente> read(){
        
        return super.read("select e from Cliente e order by e.nome");
    }
    
    public List<Cliente> read (String filtroNome){
        
        String JPQL="select e from Cliente e where e.nome like ?1" + " order by e.nome";
    
        return super.read(JPQL, "%" +filtroNome.toUpperCase()+"%");
    }    
    
///////////////////// 
    
    public List<Cliente> read(Sexo sexo){
        
         String JPQL="select e from Cliente e where e.sexo =?1" + " order by e.nome";
    
         return super.read(JPQL, sexo);
    } 
    
/////////////////////     
}
 