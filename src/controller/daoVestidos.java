
package controller;

import abstratas.dao;
import enums.Categoria;
import enums.Cores;
import enums.Tamanho;
import java.util.List;
import model.Vestidos;


public class daoVestidos extends dao<Vestidos>{
    
/////////////////////    
    
    public List<Vestidos> read (Cores cores){
        
         String JPQL="select e from Vestidos e where e.cores =?1" + " order by e.descricao";
    
         return super.read(JPQL, cores);
    }    
    
/////////////////////    
    
    public List<Vestidos> read (Tamanho tamanho){
        
         String JPQL="select e from Vestidos e where e.tamanho =?1" + " order by e.descricao";
    
         return super.read(JPQL, tamanho);
    }   
    
 /////////////////////    
    
    public List<Vestidos> read (Categoria categoria){
        
         String JPQL="select e from Vestidos e where e.categoria =?1" + " order by e.descricao";
    
         return super.read(JPQL, categoria);
    } 
    
 /////////////////////  
    
    public List<Vestidos> read(){
        
       return super.read("select e from Vestidos e order by e.descricao");
    } 
    
 /////////////////////      
}
