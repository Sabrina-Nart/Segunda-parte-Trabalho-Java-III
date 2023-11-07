
package crud;

import controller.daoCliente;
import controller.daoReservaTraje;
import controller.daoVestidos;
import java.time.LocalDate;
import model.Cliente;
import model.ReservaTraje;
import model.Vestidos;

public class crudReservaTraje {
    
    public static void main(String[] args) {
        
        daoReservaTraje daoreservaTraje= new daoReservaTraje();   
        
        ReservaTraje r1 = new ReservaTraje(0, new daoCliente().read(Cliente.class, 1), new daoVestidos().read(Vestidos.class, 1), LocalDate.MAX);
        ReservaTraje r2 = new ReservaTraje(1, new daoCliente().read(Cliente.class, 2), new daoVestidos().read(Vestidos.class, 1), LocalDate.MAX);
        ReservaTraje r3 = new ReservaTraje(2, new daoCliente().read(Cliente.class, 3), new daoVestidos().read(Vestidos.class, 3), LocalDate.MAX);
 
        try{
            
            daoreservaTraje.create(r1);
            daoreservaTraje.create(r2);
            daoreservaTraje.create(r3);
            
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
