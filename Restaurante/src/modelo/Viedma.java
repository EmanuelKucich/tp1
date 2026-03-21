package modelo;

public class Viedma implements Tarjeta {

    public double cobrar(Pedido pedido, double propina) {
        return pedido.total() + pedido.total() * propina;
    }
}