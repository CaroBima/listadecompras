
package Persistencia;

import Logica.TipoProducto;
import java.util.List;

public class ControladoraPersistencia {

    public void agregarTipoProducto(TipoProducto tipoproducto){
        TipoProductoJpaController control = new TipoProductoJpaController();
        control.create(tipoproducto);
    }
    
    public List recuperarTipoProducto(){
        TipoProductoJpaController control = new TipoProductoJpaController();
        return control.findTipoProductoEntities();
        
    }
}
