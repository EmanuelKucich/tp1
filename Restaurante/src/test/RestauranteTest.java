package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import modelo.*;

public class RestauranteTest {

    @Test
    public void testTotal(){
        Pedido p=new Pedido(new Visa(),new FakeRegistroVenta());
        p.agregarProducto(new Bebida(1000));
        p.agregarProducto(new PlatoPrincipal(5000));
        assertEquals(6079.4,p.total(),0.1);
    }
}