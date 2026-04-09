package modelo;

import java.time.LocalDate;

public interface RegistroInscripcion {
    void registrar(LocalDate fecha,int idParticipante,int idConcurso);
}