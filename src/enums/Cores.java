
package enums;

public enum Cores {
    
    R("Rosa"),
    V("Vermelho"),
    E("Verde"),
    A("Azul"),
    O("Roxo");
    
    private String descricao;
    
/////////////////////
    
    private Cores(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////////
    
    @Override
    public String toString() {
        return descricao;
    }
    
/////////////////////    
}
