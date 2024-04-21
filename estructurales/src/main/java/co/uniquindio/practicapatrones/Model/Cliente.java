package co.uniquindio.practicapatrones.Model;

public class Cliente {
    private String nombre, direccion;
    private Producto paquete;

    public Cliente(String nombre, String direccion) {
        assert nombre != null && !nombre.isBlank();
        assert direccion != null && !direccion.isBlank();

        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setPaquete(Producto producto) {
        assert producto != null;
        this.paquete = producto;
    }

    public String getNombre() {
        return nombre;
    }public String getDireccion() {
        return direccion;
    }public Producto getPaquete() {
        return paquete;
    }public void setDireccion(String direccion) {
        this.direccion = direccion;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
