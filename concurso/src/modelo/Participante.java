package modelo;

import java.util.Objects;

public class Participante {
    private int id;
    private String nombre;
    private int puntos;

    public Participante(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public void sumarPuntos(int puntos){
        this.puntos+=puntos;
    }

    public boolean tienePuntos(int p){
        return puntos==p;
    }

    public int id(){
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Participante))return false;
        Participante p=(Participante)o;
        return Objects.equals(nombre,p.nombre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
}