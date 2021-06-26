
package Persistencia;

import Logica.TipoProducto;

public class ControladoraPersistencia {

    public void agregarTipoProducto(TipoProducto tipoproducto){
        TipoProductoJpaController control = new TipoProductoJpaController();
        control.create(tipoproducto);
    }
    
}
