package modelo;

import java.util.*;

public class Pedido {
    private List<Producto> productos=new ArrayList<>();
    private Tarjeta tarjeta;
    private RegistroVenta registro;

    public Pedido(Tarjeta t,RegistroVenta r){
        tarjeta=t;
        registro=r;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public double total(){
        double subtotal=productos.stream().mapToDouble(p->p.precioConDescuento()).sum();
        double total=subtotal+(subtotal*tarjeta.recargo());
        registro.registrar(total);
        return total;
    }
}