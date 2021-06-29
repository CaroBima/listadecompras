
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;
    
    @ManyToOne //(cascade = CascadeType.PERSIST) 
    TipoProducto producto;
    //private int tipoProducto; // categoria: limpieza, almacen, electrónica, etc
    
    @Basic
    private String nombreProducto;
    private String capacidad;
    

    //constructores
    
    public Producto() {
    }

    public Producto(int idProducto, TipoProducto producto, String nombreProducto, String capacidad) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.nombreProducto = nombreProducto;
        this.capacidad = capacidad;
    }

    
    
    //getters & setters 

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public TipoProducto getProducto() {
        return producto;
    }

    public void setProducto(TipoProducto producto) {
        this.producto = producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
}


   
