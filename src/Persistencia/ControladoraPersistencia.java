//para unir la persistencia y la parte lógica

package Persistencia;

import Logica.TipoProducto;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class ControladoraPersistencia {
    
    //creo un objeto de tipo de producto 
    TipoProductoJpaController tipoProdJPA = new TipoProductoJpaController();
    
    public void crearTipoProducto (TipoProducto tipoProd){
        try{
            tipoProdJPA.create(tipoProd);
         } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
      
      
    }
    
}
