package co.edu.uniquindo.pii.proyecto.cliente.model;

public class PrecioSinDescuento implements PrecioEstrategia{
    @Override
    public double calcularPrecio(double precio){
        return precio;
    }
}