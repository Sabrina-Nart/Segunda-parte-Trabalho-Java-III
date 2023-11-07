
package crud;

import controller.daoVestidos;
import enums.Categoria;
import enums.Cores;
import enums.Tamanho;
import model.Vestidos;

public class crudVestidos {
    
    public static void main(String[] args) {  
        
        Vestidos v1 = new Vestidos(0, Cores.R, Tamanho.M, Categoria.VI, "Vestido seria perolado");
        Vestidos v2 = new Vestidos(1, Cores.A, Tamanho.P, Categoria.VL, "Vestido azul cerenity longo para festas");
        Vestidos v3 = new Vestidos(3, Cores.V, Tamanho.G, Categoria.VC, "Vestido marsala curto com tule longo");
        
        daoVestidos daovestidos = new daoVestidos(); 
        
        try{
            /*
            daovestidos.create(v1);
            daovestidos.create(v2);
            daovestidos.create(v3); */
            
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
