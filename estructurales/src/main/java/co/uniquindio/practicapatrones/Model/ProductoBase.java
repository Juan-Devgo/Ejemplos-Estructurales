package co.uniquindio.practicapatrones.Model;

public class ProductoBase implements Producto{
    private String nombre;
    //Peso en KG.
    private double precio, peso;

    public ProductoBase(String nombre, double precio, double peso) {
        assert nombre != null && !nombre.isBlank();
        assert precio > 0;
        assert peso >= 0;

        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }

    @Override
    public double calcularPeso() {
        return getPeso();
    }

    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public double getPrecio() {
        return precio;
    }public void setPrecio(double precio) {
        this.precio = precio;
    }public double getPeso() {
        return peso;
    }public void setPeso(double peso) {
        this.peso = peso;
    }
}