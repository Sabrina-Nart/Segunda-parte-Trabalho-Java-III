
package crud;

import controller.daoFuncionario;
import java.time.LocalDate;
import model.Funcionario;

public class crudFuncionario {
 
    public static void main(String[] args) {
        
        daoFuncionario daofuncionario = new daoFuncionario();   
        
        Funcionario f1 = new Funcionario(0, "Eduarda Marques", "569.256.255-85", "68521496325", "Rio Maina - Criciúma", LocalDate.MAX, "Gerente");
        Funcionario f2 = new Funcionario(1, "Alicia Miranda", "365.854.269-95", "26598743651", "Quarta Linha - Criciúma", LocalDate.MAX, "Caixa");
        Funcionario f3 = new Funcionario(2, "Clara Suaya", "895.635.745-65", "63258954963", "Morro da TV - Criciúma", LocalDate.MAX, "vendedora");
        
        try{
            /*
            daofuncionario.create(f1);
            daofuncionario.create(f2);
            daofuncionario.create(f3);*/
            
        }catch(Exception ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
        /*
        System.out.println("--Todos os clientes--");
        
        for(Cliente cliente : daocliente.read()){
            
            System.out.println(cliente.getNome()+"\t"+cliente.getNome());
        }        
       */
 
    }     
}
