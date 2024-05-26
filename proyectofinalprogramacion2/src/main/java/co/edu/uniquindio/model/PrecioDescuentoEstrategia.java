package co.edu.uniquindio.model;

public class PrecioDescuentoEstrategia implements PrecioEstrategia{
    
    @Override
    public double calcularPrecio(double precio){
        double precioFinal = precio - (precio *(0.2));
        return precioFinal;
    }
}