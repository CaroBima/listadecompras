//para procesar lo que se ingresa en la IGU

package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    //Agrega un nuevo producto a la base de datos
    public void agregarProducto(String nombre, String capacidad, int IndiceTipoPord ){
       
    }
    
    //Agrega un nuevo tipo de producto
    public void agregarNuevoTipoProducto(String nuevoTipoProducto){
                
        ControladoraPersistencia control = new ControladoraPersistencia();
        TipoProducto tipoProd = new TipoProducto();
        
        tipoProd.setCategoría(nuevoTipoProducto);
        control.agregarTipoProducto(tipoProd);
    }
    
}
