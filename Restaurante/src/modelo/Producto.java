package modelo;

public abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double precio() {
        return precio;
    }

    public boolean esBebida() {
        return false;
    }

    public boolean esPlatoPrincipal() {
        return false;
    }
}