
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
@Table(name = "TB_LOCACAO")

public class Locacao implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @SwingColumn(description = "Código")
    @Column(name = "ID_LOCACAO", nullable = false)
    private int id;  
    
/////
    
    @SwingColumn(description = "Reserva do Traje")
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_RESERVA_TRAJE", nullable = false, referencedColumnName = "ID_RESERVA_TRAJE")
    private ReservaTraje reservaTraje; 
    
    @SwingColumn(description = "Funcionário")
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_FUNCIONARIO", nullable = false, referencedColumnName = "ID_FUNCIONARIO")
    private Funcionario funcionario; 
    
/////
    
    @SwingColumn(description = "Total dos Vestidos")
    @Column(name = "TOTAL_VESTIDOS", nullable = false)  
    private double totalVestidos; 

    @SwingColumn(description = "Evento")
    @Column(name = "EVENTO", nullable = false)  
    private String evento;
    
/////
    
    @SwingColumn(description = "Data de Retirada")
    @Column(name = "DATA_RETIRADA", nullable = false)
    private LocalDate data_retirada;
    
    @SwingColumn(description = "Data de Entrega")
    @Column(name = "DATA_ENTREGA", nullable = false)
    private LocalDate data_entrega;
    
/////////////////////   
    
    public Locacao(){
        
        this.setId(0);
        this.setReservaTraje(null);
        this.setFuncionario(null);
        this.setTotalVestidos(0);
        this.setEvento("VÁZIO");
        this.setDataRetirada(null);
        this.setDataEntrega(null);
    }
    
/////////////////////   
    
    public Locacao(int id, ReservaTraje reservaTraje, Funcionario funcionario, double total_vestido, String evento, LocalDate data_retirada, LocalDate data_entrega) {
        
        this.setId(id);
        this.setReservaTraje(reservaTraje);
        this.setFuncionario(funcionario);
        this.setTotalVestidos(total_vestido);
        this.setEvento(evento);
        this.setDataRetirada(data_retirada);
        this.setDataEntrega(data_entrega);
    }
    
/////////////////////   
    
    public void setId(int id) {
        
        this.id = id;
    }

    public void setReservaTraje(ReservaTraje reservaTraje) {
        this.reservaTraje = reservaTraje;
    }

    public void setFuncionario(Funcionario funcionario) {
        
        this.funcionario = funcionario;
    }
    
    public void setTotalVestidos(double totalVestidos) {
        this.totalVestidos = totalVestidos < 0 ? 0 : totalVestidos;
    }

    public void setEvento(String evento) {
        this.evento = evento.trim().isEmpty() ? "VÁZIO" : evento.toUpperCase();
    }

    public void setDataRetirada(LocalDate data_retirada) {
        this.data_retirada = data_retirada == null ? LocalDate.now() : data_retirada;;
    }

    public void setDataEntrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega == null ? LocalDate.now() : data_entrega;;
    }
       
/////////////////////
    
    public int getId() {
        return this.id;
    }

    public ReservaTraje getReservaTraje() {
        return this.reservaTraje;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public double getTotalVestidos() {
        return this.totalVestidos;
    }

    public String getEvento() {
        return this.evento;
    }

    public LocalDate getData_retirada() {
        return this.data_retirada;
    }

    public LocalDate getData_entrega() {
        return this.data_entrega;
    }
                                      
/////////////////////
    
    @Override
    public String toString() {
        return "Locacao: " + "id=" + id + ", reservaTraje=" + reservaTraje + '}';
    }
    
/////////////////////   
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Locacao other = (Locacao) obj;
        return this.id == other.id;
    }
    
/////////////////////       
}
