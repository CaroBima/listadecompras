package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoProducto implements Serializable {
    
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int idTipoProducto;
    
    @Basic
    private String categoría; //almacen, panaderia, electrónica, indumentaria, etc

    public TipoProducto(String categoría) {
       // this.idTipoProducto = idTipoProducto;
        this.categoría = categoría;
    }
    
    public TipoProducto() {
        
    }
    

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
    
    
}
