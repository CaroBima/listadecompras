//para unir la persistencia y la parte lógica

package Persistencia;

import Logica.TipoProducto;
import Persistencia.exceptions.NonexistentEntityException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class ControladoraPersistencia {
    
    //creo un objeto de tipo de producto 
    TipoProductoJpaController tipoProdJPA = new TipoProductoJpaController();
    
    //metodo para crear tipo de producto
    public void crearTipoProducto (TipoProducto tipoProd){
        try{
            tipoProdJPA.create(tipoProd);
         } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
    }
    
    //eliminar tipo de producto
    public void eliminarTipoProducto(TipoProducto tipoProd){
        int indice;
        indice = tipoProd.getIdTipoProducto();
        try {
            tipoProdJPA.destroy(indice);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
     
     //modificar tipo de producto
     
     //leer tipo de producto
      
   
    
}
