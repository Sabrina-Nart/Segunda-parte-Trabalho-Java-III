
package enums;

public enum Categoria {
    
    VL("Vestido Longo"),
    VC("Vestido Curto"),
    VM("Vestido Midi"),
    VP("Vestido 15 anos"),
    VI("Vestido Infantil");
    
    private String descricao;
    
///////////////////// 
    
    private Categoria(String descricao) {
        this.descricao = descricao;
    }
    
///////////////////// 
    
    @Override
    public String toString() {    
        return descricao;
    }
    
/////////////////////     
}
