
package crud;

import abstratas.dao;
import controller.daoCliente;
import enums.Sexo;
import model.Cliente;

public class crudCliente {

    public static void main(String[] args) {
        
        daoCliente daocliente = new daoCliente();   
        
        Cliente c1 = new Cliente(0, "Isadora Comin Nart", "123.456.789-00", "999971234", "Alto Rio Maina - Siderópolis", Sexo.F);
        Cliente c2 = new Cliente(1, "Sabrina Comin Nart", "111.222.222-33", "999971234", "Alto Rio Maina - Siderópolis", Sexo.F);
        Cliente c3 = new Cliente(2, "Maynara Colombo Comin", "586.956.789-55", "48997770000", "São Martilho Alto - Siderópolis", Sexo.F);
   
        try{

            
        }catch(Exception ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
 
    }    
}
