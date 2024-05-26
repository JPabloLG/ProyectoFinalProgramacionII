package co.edu.uniquindio.model;

public class Camisa extends Producto implements Cloneable {
    private Camisa(Builder builder) {
        this.talla = builder.talla;
        this.color = builder.color;
        this.precio = builder.precio;
    }

    public static class Builder {
        private String talla;
        private String color;
        private double precio;

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

    public void setPrecio(int i) {
        
    }
}
