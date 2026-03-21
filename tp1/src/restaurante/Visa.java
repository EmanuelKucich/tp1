package restaurante;

public class Visa implements Tarjeta {

    public double cobrar(Pedido pedido, double propina) {
        double subtotal = pedido.total() - pedido.totalBebidas() * 0.03;
        return subtotal + subtotal * propina;
    }
}