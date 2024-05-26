package co.edu.uniquindio.model;

public class PrecioSinDescuento implements PrecioEstrategia{
    @Override
    public double calcularPrecio(double precio){
        return precio;
    }
}