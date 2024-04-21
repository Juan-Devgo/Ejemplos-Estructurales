package co.uniquindio.practicapatrones.Model;

public class Tienda {
    
    public String generarRecibo(Cliente cliente) {
        
        String recibo = "Estimado " + cliente.getNombre() + ",\nSu paquete le llegará a: " + cliente.getDireccion() + "." +
                        "\nEn un tiempo estimado de 3 días.\nValor a pagar: " + cliente.getPaquete().calcularPrecio() +
                        "\nPeso del paquete: " + cliente.getPaquete().calcularPeso() + " Kg.";

        return recibo;
        }
}