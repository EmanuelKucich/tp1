package restaurante;

public class Mastercard implements Tarjeta {

    public double cobrar(Pedido pedido, double propina) {
        double subtotal = pedido.total() - pedido.totalPlatos() * 0.02;
        return subtotal + subtotal * propina;
    }
}