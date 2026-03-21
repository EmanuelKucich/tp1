package modelo;

public class Participante {
    private String nombre;
    private int puntos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void recibirPuntosPorInscripcion() {
        this.puntos += 10;
    }

    public boolean tienePuntos(int puntosEsperados) {
        return this.puntos == puntosEsperados;
    }
}