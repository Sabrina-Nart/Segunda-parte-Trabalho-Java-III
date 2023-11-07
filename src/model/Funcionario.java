
package model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FUNCIONARIO")

public class Funcionario implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @SwingColumn(description = "Código")
    @Column(name = "ID_FUNCIONARIO", nullable = false)
    private int id;
    
    @SwingColumn(description = "Nome do Funcionário")
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;    

    @SwingColumn(description = "CPF")
    @Column(name = "CPF", length = 14, nullable = false)    
     private String cpf;
    
    @SwingColumn(description = "Telefone")
    @Column(name = "TELEFONE", length = 11, nullable = false)
    private String telefone;    

    @SwingColumn(description = "Endereço")
    @Column(name = "ENDERECO", length = 100, nullable = false)
    private String endereco;  
    
    @SwingColumn(description = "Data de Contratação")
    @Column(name = "DATA_CONTRATACAO", nullable = false)
    private LocalDate dataContratacao;
    
    @SwingColumn(description = "Função")
    @Column(name = "FUNCAO", length = 50, nullable = false)
    private String funcao;     
    
/////////////////////     

        public Funcionario() {
        
        this.setId(0);
        this.setNome("VÁZIO");
        this.setCpf("");
        this.setTelefone("");
        this.setEndereco("VÁZIO");
        this.setDataContratacao(null);
        this.setFuncao("FUNCAO");
    }
        
/////////////////////   
        
    public Funcionario(int id, String nome, String cpf, String telefone, String endereco, LocalDate dataContratacao, String funcao) {
        
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setDataContratacao(dataContratacao);
        this.setFuncao(funcao);
    }
    
/////////////////////   
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "VÁZIO" : nome.toUpperCase();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "" : cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "" : telefone;
    }                                                         

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "VÁZIO" : endereco.toUpperCase();
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao.trim().isEmpty() ? "VÁZIO" : funcao.toUpperCase();
    }                                                                                    
    
/////////////////////   
    
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public LocalDate getDataContratacao() {
        return this.dataContratacao;
    }

    public String getFuncao() {
        return this.funcao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " e Função: " + funcao;
    }
    
/////////////////////   
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        return this.id == other.id;
    }
        
/////////////////////       
}
