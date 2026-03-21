package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public double total() {
        return productos.stream().mapToDouble(Producto::precio).sum();
    }

    public double totalBebidas() {
        return productos.stream().filter(Producto::esBebida).mapToDouble(Producto::precio).sum();
    }

    public double totalPlatos() {
        return productos.stream().filter(Producto::esPlatoPrincipal).mapToDouble(Producto::precio).sum();
    }
}