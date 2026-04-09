package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import modelo.*;

public class ConcursoTest {

    @Test
    public void testInscripcionPrimerDia(){
        Concurso c=new Concurso(
            1,
            LocalDate.now(),
            LocalDate.now().plusDays(2),
            10,
            new FakeRegistroInscripcion(),
            new FakeNotificador()
        );

        Participante p=new Participante(1,"Juan");

        c.inscribir(p,LocalDate.now());

        assertTrue(p.tienePuntos(10));
    }
}