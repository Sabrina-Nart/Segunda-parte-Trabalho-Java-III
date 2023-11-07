
package model;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "TB_RESERVA_TRAJE")

public class ReservaTraje implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @SwingColumn(description = "Código")
    @Column(name = "ID_RESERVA_TRAJE", nullable = false)
    private int id;    
    
////  
    
    @SwingColumn(description = "Cliente")
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CLIENTE", nullable = false, referencedColumnName = "ID_CLIENTE")
    private Cliente cliente; 
 
    @SwingColumn(description = "Vestido")
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_VESTIDO", nullable = false, referencedColumnName = "ID_VESTIDO")
    private Vestidos vestidos; 
    
/////
    
    @SwingColumn(description = "Data da Reservada")
    @Column(name = "DATA_LOCACAO", nullable = false)
    private LocalDate dataLocacao;
    
////////////////// 

    public ReservaTraje() {
        this.setId(0);
        this.setCliente(null);
        this.setVestidos(null);
        this.setDataLocacao(null);
    }
    
////////////////// 
    
    public ReservaTraje(int id, Cliente cliente, Vestidos vestidos, LocalDate dataLocacao) {
        this.setId(id);
        this.setCliente(cliente);
        this.setVestidos(vestidos);
        this.setDataLocacao(dataLocacao);
    }
    
////////////////// 
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVestidos(Vestidos vestidos) {
        this.vestidos = vestidos;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    
////////////////// 
    
    public int getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Vestidos getVestidos() {
        return this.vestidos;
    }

    public LocalDate getDataLocacao() {
        return this.dataLocacao;
    }
    
////////////////// 

    @Override
    public String toString() {
        return "" + cliente + ", Traje(s): " + vestidos + ", Data da Locação: " + dataLocacao + '}';
    }

////////////////// 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final ReservaTraje other = (ReservaTraje) obj;
        return this.id == other.id;
    }
 
//////////////////     
}
