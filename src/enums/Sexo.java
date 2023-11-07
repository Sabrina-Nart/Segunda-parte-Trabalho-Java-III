
package enums;

public enum Sexo {
    
    F("Feminino"),
    M("Masculino"),
    O("Outro");
    
    private String descricao;
    
/////////////////////
    
    private Sexo(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////////
    
    @Override
    public String toString() {
        return descricao;
    }
    
/////////////////////    
}
