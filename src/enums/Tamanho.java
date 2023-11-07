
package enums;

public enum Tamanho {
    
    Z("10"),
    D("12"),
    Q("14"),
    E("16"),
    P("P"),
    M("M"),
    G("G"),
    K("GG"),
    X("XK"),
    W("XGG");
    
    private String descricao;
    
/////////////////////  
    
    private Tamanho(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////////  
    
    @Override
    public String toString() {
        return descricao;
    }
    
/////////////////////      
}
