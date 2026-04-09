package modelo;

public class Bebida extends Producto {

    public Bebida(double precio){
        super(precio);
    }

    public double precioConDescuento(){
        return precio - (precio*0.03);
    }
}