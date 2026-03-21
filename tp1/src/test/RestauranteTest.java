package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import restaurante.*;

public class RestauranteTest {

    @Test
    public void calculoVisa() {
        Pedido pedido = new Pedido();
        pedido.agregar(new Bebida("Coca",1000));
        pedido.agregar(new PlatoPrincipal("Pizza",5000));
        Tarjeta visa = new Visa();
        assertEquals(6079.4, visa.cobrar(pedido,0.02),0.1);
    }

    @Test
    public void calculoMastercard() {
        Pedido pedido = new Pedido();
        pedido.agregar(new Bebida("Coca",1000));
        pedido.agregar(new PlatoPrincipal("Pizza",5000));
        Tarjeta mastercard = new Mastercard();
        assertEquals(6018, mastercard.cobrar(pedido,0.02),0.1);
    }

    @Test
    public void calculoComarcaPlus() {
        Pedido pedido = new Pedido();
        pedido.agregar(new Bebida("Coca",1000));
        pedido.agregar(new PlatoPrincipal("Pizza",5000));
        Tarjeta comarca = new ComarcaPlus();
        assertEquals(5997.6, comarca.cobrar(pedido,0.02),0.1);
    }

    @Test
    public void calculoViedma() {
        Pedido pedido = new Pedido();
        pedido.agregar(new Bebida("Coca",1000));
        pedido.agregar(new PlatoPrincipal("Pizza",5000));
        Tarjeta viedma = new Viedma();
        assertEquals(6120, viedma.cobrar(pedido,0.02),0.1);
    }
}