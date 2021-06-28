package Logica;

import Igu.FrmPrincipal;
import Persistencia.ControladoraPersistencia;

public class Main {


    public static void main(String[] args) {
        
        FrmPrincipal formulario = new FrmPrincipal();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null); //ubica el form en le centro de la pantalla
        
        
        /*
        probando si dejaba guardar en bd
        TipoProducto tipoProd = new TipoProducto();
        ControladoraPersistencia control = new ControladoraPersistencia();
        tipoProd.setCategoría("Almacén");
        
        control.agregarTipoProducto(tipoProd);
        */
        
        
      
    }
    
}
