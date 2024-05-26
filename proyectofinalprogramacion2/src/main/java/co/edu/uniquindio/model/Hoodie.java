package co.edu.uniquindo.pii.proyecto.cliente.model;

public class Hoodie {
    private String talla;
    private String color;
    private double precio;

    private Hoodie(Builder builder) {
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

        public Hoodie build() {
            return new Hoodie(this);
        }
    }
}