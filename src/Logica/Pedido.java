
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPedido; 
    
    @Basic
    private double precioFacturado; //si falta algun producto no lo cobran, el precio facturado puede diferir del precio final del pedido
    private double precioFinalPedido;
     
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;

   
     public Pedido() {
    }

     
    public Pedido(double precioFacturado, double precioFinalPedido, int idPedido, Date fechaPedido) {
        this.precioFacturado = precioFacturado;
        this.precioFinalPedido = precioFinalPedido;
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
    }

    public double getPrecioFacturado() {
        return precioFacturado;
    }

    public void setPrecioFacturado(double precioFacturado) {
        this.precioFacturado = precioFacturado;
    }

    public double getPrecioFinalPedido() {
        return precioFinalPedido;
    }

    public void setPrecioFinalPedido(double precioFinalPedido) {
        this.precioFinalPedido = precioFinalPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
