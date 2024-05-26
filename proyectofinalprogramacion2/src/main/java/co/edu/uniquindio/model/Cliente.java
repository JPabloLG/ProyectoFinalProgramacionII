package co.edu.uniquindo.pii.proyecto.cliente.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario implements Observer{
    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;
    private List<PedidoCliente> pedidos;

    public Cliente(String nombre, String codigo, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add((PedidoCliente) pedido);
    }

    public void eliminarPedido(Pedido pedido){
        pedidos.remove((PedidoCliente) pedido);
    }

    @Override
    public void update(){
        System.out.println("El pedido de " + nombre + " ha sido correctamente cambiado");
    }
}