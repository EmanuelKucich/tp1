package modelo;

public class Visa implements Tarjeta{

    public double descuento(){
        return 0.1;
    }

    public double cobrar(Pedido pedido,double propina){
        return pedido.total()+(pedido.total()*propina);
    }
}