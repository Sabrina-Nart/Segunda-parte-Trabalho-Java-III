
package crud;

import controller.daoFuncionario;
import controller.daoLocacao;
import controller.daoReservaTraje;
import java.time.LocalDate;
import model.Funcionario;
import model.Locacao;
import model.ReservaTraje;

public class crudLocacao {
   
    public static void main(String[] args) {
        
        daoLocacao daolocacao = new daoLocacao();
         
        Locacao l1 = new Locacao(0, new daoReservaTraje().read(ReservaTraje.class, 1), new daoFuncionario().read(Funcionario.class, 1), 1, "Casamento", LocalDate.MAX, LocalDate.MAX);
        Locacao l2 = new Locacao(1, new daoReservaTraje().read(ReservaTraje.class, 2), new daoFuncionario().read(Funcionario.class, 1), 1, "Casamento", LocalDate.MAX, LocalDate.MAX);
        Locacao l3 = new Locacao(2, new daoReservaTraje().read(ReservaTraje.class, 1), new daoFuncionario().read(Funcionario.class, 1), 1, "Casamento", LocalDate.MAX, LocalDate.MAX);
       
        try{
            
            daolocacao.create(l1);                 
            daolocacao.create(l2);
            daolocacao.create(l3);
            
        }catch(Exception ex){
            System.out.println("ERRO:"+ex.getMessage());
        }  
    }    
}
