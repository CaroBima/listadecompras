package Logica;

import Igu.FrmPrincipal;
import Persistencia.ControladoraPersistencia;

public class Main {


    public static void main(String[] args) {
        
        FrmPrincipal formulario = new FrmPrincipal();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null); //ubica el form en le centro de la pantalla
        
        TipoProducto tipoProd = new TipoProducto();
        tipoProd.setCategoría("Almacén");
        
        
      
    }
    
}
