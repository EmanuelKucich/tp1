package modelo;

public abstract class Producto {
    protected double precio;

    public Producto(double precio){
        this.precio=precio;
    }

    public abstract double precioConDescuento();
}