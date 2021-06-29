
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
    
    public boolean estaElTipoProducto(TipoProducto tipoProd){
        TipoProductoJpaController control = new TipoProductoJpaController();
        TipoProducto tipoProdCtrl = new TipoProducto();
        int idTipoProd;
        idTipoProd = tipoProd.getIdTipoProducto();
        tipoProdCtrl = control.findTipoProducto(idTipoProd);   
            return tipoProdCtrl != null; // retorna true si esta en la bd
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
