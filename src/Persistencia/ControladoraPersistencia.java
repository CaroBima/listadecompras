
package Persistencia;

import Logica.Producto;
import Logica.TipoProducto;
import java.util.List;

public class ControladoraPersistencia {

    //Tipo de producto:
    public void agregarTipoProducto(TipoProducto tipoproducto){
        TipoProductoJpaController control = new TipoProductoJpaController();
        control.create(tipoproducto);
    }
    
    public List recuperarTipoProducto(){
        TipoProductoJpaController control = new TipoProductoJpaController();
        return control.findTipoProductoEntities();
        
    }
    
    
    //Producto:
    
    public void agregarProducto(String nombre, String capacidad, TipoProducto idTipoProd){
        ProductoJpaController control = new ProductoJpaController();
        Producto nuevoProd = new Producto();
        nuevoProd.setNombreProducto(nombre);
        nuevoProd.setCapacidad(capacidad);
        nuevoProd.setProducto(idTipoProd);
        control.create(nuevoProd);
       
    
    }
}
