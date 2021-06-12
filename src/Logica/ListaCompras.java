package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ListaCompras implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idLista;
    
    @ManyToOne
    private int idPedido;
    
    @OneToMany
    private int idProducto;
    
    @Temporal(TemporalType.DATE)
    private Date fechaAgregado;
    
    @Basic
    private boolean disponibleONo;
    private int unidadesPedidas;
    private double precioUnitario;

    public ListaCompras() {
    }

    public ListaCompras(int idLista, int idPedido, int idProducto, Date fechaAgregado, boolean disponibleONo, int unidadesPedidas, double precioUnitario) {
        this.idLista = idLista;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.fechaAgregado = fechaAgregado;
        this.disponibleONo = disponibleONo;
        this.unidadesPedidas = unidadesPedidas;
        this.precioUnitario = precioUnitario;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(Date fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }

    public boolean isDisponibleONo() {
        return disponibleONo;
    }

    public void setDisponibleONo(boolean disponibleONo) {
        this.disponibleONo = disponibleONo;
    }

    public int getUnidadesPedidas() {
        return unidadesPedidas;
    }

    public void setUnidadesPedidas(int unidadesPedidas) {
        this.unidadesPedidas = unidadesPedidas;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
    
}
