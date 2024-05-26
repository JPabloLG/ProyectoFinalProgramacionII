package co.edu.uniquindo.pii.proyecto.cliente.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends SujetoObserver{
    private Cliente cliente;
    private List<Producto> listaProductos;

    public Pedido (){
        this.listaProductos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
        notificarObservador(cliente);
    }

    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
        notificarObservador(cliente);
    }
}