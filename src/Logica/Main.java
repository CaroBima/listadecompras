package Logica;

import Igu.FrmPrincipal;
import Persistencia.ControladoraPersistencia;

public class Main {


    public static void main(String[] args) {
        
        FrmPrincipal formulario = new FrmPrincipal();
        formulario.setVisible(true);
        //formulario.setLocationByPlatform(true);
        formulario.setLocationRelativeTo(null); //ubica el form en le centro de la pantalla
    
        //Inicializo la instancia de la controladora de persistencia
        ControladoraPersistencia ControlPersis = new ControladoraPersistencia();
        TipoProducto tipoProd = new TipoProducto();
        String cat = "Almacén";
        tipoProd.setCategoría(cat);
        //tipoProd.setIdTipoProducto(0);
        ControlPersis.crearTipoProducto(tipoProd);
        
    }
    
}
