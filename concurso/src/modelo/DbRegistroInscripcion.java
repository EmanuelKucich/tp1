package modelo;

import java.time.LocalDate;

public class DbRegistroInscripcion implements RegistroInscripcion {

    public void registrar(LocalDate fecha,int idP,int idC){
        System.out.println("DB: "+fecha+" "+idP+" "+idC);
    }
}