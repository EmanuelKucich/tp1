package modelo;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TxtRegistroVenta implements RegistroVenta {

    public void registrar(double total){
        try(FileWriter w=new FileWriter("ventas.txt",true)){
            String f=LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            w.write(f+" || "+total+"\n");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}