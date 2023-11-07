
package controller;

import abstratas.dao;
import java.util.Date;
import java.util.List;
import model.Locacao;


public class daoLocacao extends dao<Locacao>{
    
    public List<Locacao> read (){
        
        return super.read("select e from Locacao e");
    }    
    
///////////////////// 
    
    public List<Locacao> read(String filtroEvento){
        
        String JPQL="select e from Locacao e where e.funcao like ?1" + " order by e.evento";
    
        return super.read(JPQL, "%" + filtroEvento.toUpperCase()+"%");
    } 
    
/////////////////////      
    
    public List<Locacao> read(Date filtroDataRetirada){
        
        String JPQL="select e from Locacao e where e.data_retirada like ?1" + " order by e.data_retirada";
    
        return super.read(JPQL, "%" + filtroDataRetirada +"%");
    } 
    
/////////////////////        
}
