package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements ProductoComp {
    private String nombre;
    private List<ProductoComp> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void addProducto(ProductoComp producto) {
        productos.add(producto);
    }

    public void removeProducto(ProductoComp producto) {
        productos.remove(producto);
    }

    @Override
    public String getDescripcion() {
        return nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + nombre);
        for (ProductoComp producto : productos) {
            producto.mostrarDetalles();
        }
    }
}
