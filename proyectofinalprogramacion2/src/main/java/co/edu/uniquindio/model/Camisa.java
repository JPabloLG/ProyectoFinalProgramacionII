package co.edu.uniquindio.model;

public class Camisa extends Producto implements Cloneable, ProductoComp {
    
    private Camisa(Builder builder) {
        this.talla = builder.talla;
        this.color = builder.color;
        this.precio = builder.precio;
        this.descripcion = builder.descripcion;
    }

    public static class Builder {
        private String talla;
        private String color;
        private double precio;
        private String descripcion;

        public Builder setTalla(String talla) {
            this.talla = talla;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }
        
        public Builder setDescripcion(String descripcion){
            this.descripcion = descripcion;
            return this;
        }

        public Camisa build() {
            return new Camisa(this);
        }
    }

    @Override
    public Camisa clone() {
        try {
            return (Camisa) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Nunca debería suceder porque estamos implementando Cloneable
        }
    }

    @Override
    public String toString() {
        return "Camisa [talla=" + talla + ", color=" + color + ", precio=" + precio + "]";
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + descripcion + " | Precio: " + precio);
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}

