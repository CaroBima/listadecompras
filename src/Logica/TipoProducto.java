package Logica;

public class TipoProducto {
    private int idTipoProducto;
    private String categoría; //almacen, panaderia, electrónica, indumentaria, etc

    public TipoProducto(int idTipoProducto, String categoría) {
        this.idTipoProducto = idTipoProducto;
        this.categoría = categoría;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
    
    
}
