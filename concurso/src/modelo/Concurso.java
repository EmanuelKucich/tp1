package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String nombre;
    private LocalDate inicio;
    private LocalDate fin;
    private List<Participante> participantes;

    public Concurso(String nombre, LocalDate inicio, LocalDate fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.participantes = new ArrayList<>();
    }

    public void inscribir(Participante participante, LocalDate fecha) {
        if (!fechaValida(fecha)) {
            throw new RuntimeException("Fuera de fecha");
        }

        participantes.add(participante);

        if (fecha.equals(inicio)) {
            participante.recibirPuntosPorInscripcion();
        }
    }

    private boolean fechaValida(LocalDate fecha) {
        return !fecha.isBefore(inicio) && !fecha.isAfter(fin);
    }

    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }
}