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
    public void borrarTipoProducto(TipoProducto tipoProd){
        int indice;
        indice = tipoProd.getIdTipoProducto();
        try {
            tipoProdJPA.destroy(indice);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
     
     //modificar tipo de producto
     public void editarTipoProducto (TipoProducto tipoProd){
        try {
            tipoProdJPA.edit(tipoProd);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     }
     
     //leer tipo de producto
     public void leerTipoProducto(TipoProducto tipoProd){
         int indice;
         TipoProducto tipoP = new TipoProducto();
         indice = tipoProd.getIdTipoProducto(); //obtengo el indice del producto
         tipoP = tipoProdJPA.findTipoProducto(indice); //leo el tipo de producto buscado, segun su indice
    }
   
    
}
