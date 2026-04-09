package modelo;

import java.time.LocalDate;
import java.util.*;

public class Concurso {
    private int id;
    private LocalDate inicio;
    private LocalDate fin;
    private int puntos;
    private List<Participante> participantes=new ArrayList<>();
    private RegistroInscripcion registro;
    private Notificador notificador;

    public Concurso(int id,LocalDate i,LocalDate f,int p,RegistroInscripcion r,Notificador n){
        this.id=id;
        inicio=i;
        fin=f;
        puntos=p;
        registro=r;
        notificador=n;
    }

    public void inscribir(Participante p,LocalDate fecha){
        if(fecha.isBefore(inicio)||fecha.isAfter(fin))
            throw new RuntimeException();

        participantes.add(p);

        if(fecha.equals(inicio))
            p.sumarPuntos(puntos);

        registro.registrar(fecha,p.id(),id);
        notificador.enviar("Inscripto");
    }

    public boolean estaInscripto(Participante p){
        return participantes.contains(p);
    }
}