
package controller;

import abstratas.dao;
import java.util.List;
import model.Funcionario;


public class daoFuncionario extends dao<Funcionario>{
    
    public List<Funcionario> read (){
        
        return super.read("select e from Funcionario e order by e.nome");
    }    
    
///////////////////// 
    
    public List<Funcionario> read(String filtroFuncao){
        
        String JPQL="select e from Funcionario e where e.funcao like ?1" + " order by e.funcao";
    
        return super.read(JPQL, "%" + filtroFuncao.toUpperCase()+"%");
    } 
    
/////////////////////          
}

