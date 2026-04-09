package modelo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Concurso c=new Concurso(
            1,
            LocalDate.now(),
            LocalDate.now().plusDays(2),
            10,
            new TxtRegistroInscripcion(),
            new MailtrapNotificador()
        );

        c.inscribir(new Participante(1,"Ema"),LocalDate.now());
    }
}