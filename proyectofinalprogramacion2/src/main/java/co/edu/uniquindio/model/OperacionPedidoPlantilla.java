package co.edu.uniquindio.model;

public abstract class OperacionPedidoPlantilla {

    public abstract void personalizarPedido();
    public abstract void anularPedido();
    public abstract void realizarPedido();

    public final void template(){
        personalizarPedido();
        anularPedido();
        realizarPedido();
    }
}