package restaurante;

public class ComarcaPlus implements Tarjeta {

    public double cobrar(Pedido pedido, double propina) {
        double subtotal = pedido.total() - pedido.total() * 0.02;
        return subtotal + subtotal * propina;
    }
}