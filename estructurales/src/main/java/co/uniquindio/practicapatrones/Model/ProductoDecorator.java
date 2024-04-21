package co.uniquindio.practicapatrones.Model;

public class ProductoDecorator implements Producto {
    private String nombre;
    //Peso en KG.
    private double precio, peso;
    private Producto productoBase;

    public ProductoDecorator(String nombre, double precio, double peso, Producto productoBase) {
        assert nombre != null && !nombre.isBlank();
        assert precio > 0;
        assert peso >= 0;
        assert productoBase != null;

        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.productoBase = productoBase;
    }

    @Override
    public double calcularPrecio() {
        double precio = this.precio + productoBase.calcularPrecio();
        return precio;
    }

    @Override
    public double calcularPeso() {
        double peso = this.peso + productoBase.calcularPeso();
        return peso;
    }

    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public double getPrecio() {
        return precio;
    }public void setPrecio(double precio) {
        this.precio = precio;
    }public Producto getProductoBase() {
        return productoBase;
    }
}