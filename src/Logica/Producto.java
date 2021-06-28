
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
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
    
    @ManyToOne
    private int tipoProducto; // categoria: limpieza, almacen, electrónica, etc
    
    @Basic
    private String nombreProducto;
    private String capacidad;
    

    //constructores
    
    public Producto() {
    }

    public Producto(int idProducto, int tipoProducto, String nombreProducto, String capacidad) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
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

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
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

  /*  Lo quito de esta clase porque va a estar en la clase pedidos, el precio puede
    variar entre pedidos dependiendo de la inflacion, guardandolo ahi se puede ver la
    variacion de precios del producto
    
    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }
    */
    
   
