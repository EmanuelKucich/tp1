package modelo;

public class PlatoPrincipal extends Producto {

    public PlatoPrincipal(double precio){
        super(precio);
    }

    public double precioConDescuento(){
        return precio - (precio*0.02);
    }
}