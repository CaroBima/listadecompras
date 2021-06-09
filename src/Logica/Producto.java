
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Producto implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int idProducto;
    
    @OneToOne
    private String tipoProducto; // categoria: limpieza, almacen, electrónica, etc
    
    @Basic
    private String nombreProducto;
    private String capacidad;
    

    public Producto() {
    }

    public Producto(int idProducto, String tipoProducto, String nombreProducto, String capacidad, String precioProducto) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.capacidad = capacidad;
        /*this.precioProducto = precioProducto;*/
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
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
    
    
}
