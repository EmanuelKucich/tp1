package restaurante;

public class PlatoPrincipal extends Producto {

    public PlatoPrincipal(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public boolean esPlatoPrincipal() {
        return true;
    }
}