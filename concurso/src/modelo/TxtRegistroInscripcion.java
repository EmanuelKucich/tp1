package modelo;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TxtRegistroInscripcion implements RegistroInscripcion {

    public void registrar(LocalDate fecha,int idP,int idC){
        try(FileWriter w=new FileWriter("inscripciones.txt",true)){
            String f=fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            w.write(f+","+idP+","+idC+"\n");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}