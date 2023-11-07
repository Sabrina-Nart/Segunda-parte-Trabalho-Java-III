
package model;

import enums.Categoria;
import enums.Cores;
import enums.Tamanho;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Serve para aparecer no persistence.xml
@Table(name = "TB_VESTIDOS")

public class Vestidos implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @SwingColumn(description = "Código")
    @Column(name = "ID_VESTIDO",nullable = false)
    private int id;  
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "COR", nullable = false, length = 1)
    @SwingColumn(description = "Cor")
    private Cores cores;
   
    @Enumerated(EnumType.STRING) 
    @Column(name = "TAMANHO", nullable = false, length = 1)
    @SwingColumn(description = "Tamanho")
    private Tamanho tamanho;
  
    @Enumerated(EnumType.STRING) 
    @Column(name = "CATEGORIA", nullable = false, length = 2)
    @SwingColumn(description = "Categoria")
    private Categoria categoria;

    @Column(name = "DESCRICAO", nullable = false, length = 200) 
    @SwingColumn(description = "Descrição")
    private String descricao;    
    
/////////////////////
    
    public Vestidos() {
        this.setId(0);
        this.setCores(cores.A);
        this.setTamanho(tamanho.P);
        this.setCategoria(categoria.VC);
        this.setDescricao("VÁZIO");
    }
    
/////////////////////
    
    public Vestidos(int id, Cores cores, Tamanho tamanho, Categoria categoria, String descricao) {
        
        this.setId(id);
        this.setCores(cores);
        this.setTamanho(tamanho);
        this.setCategoria(categoria);
        this.setDescricao(descricao);
    }
    
/////////////////////
    
    public void setId(int id) {
        
        this.id = id;
    }

    public void setCores(Cores cores) {
        
        this.cores = cores;
    }

    public void setTamanho(Tamanho tamanho) {
        
        this.tamanho = tamanho;
    }

    public void setCategoria(Categoria categoria) {
        
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao.trim().isEmpty() ? "VÁZIO" : descricao.toUpperCase();
    }
    
/////////////////////
    
    public int getId() {
        
        return this.id;
    }

    public Cores getCores() {
        
        return this.cores;
    }

    public Tamanho getTamanho() {
        
        return this.tamanho;
    }

    public Categoria getCategoria() {
        
        return this.categoria;
    }

    public String getDescricao() {
        
        return this.descricao;
    }
    
/////////////////////

    @Override
    public String toString() {
        return "Cor: " + cores + " - Tamanho: " + tamanho + " - Categoria: " + categoria + " - Descrição: " + descricao;
    }
    
/////////////////////
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
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
        final Vestidos other = (Vestidos) obj;
        return this.id == other.id;
    }
    
/////////////////////    
}
