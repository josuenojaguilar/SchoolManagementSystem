package model;

import java.time.LocalDate;

import utils.Estado;

public class Estudiante extends Persona {
    private Estado estado;
    

    public Estudiante() {
        super();
    }

    public Estudiante(Long id, String nombre, String apellido, LocalDate fechaDeNacimiento, Estado estado) {
        super(id, nombre, apellido, fechaDeNacimiento);
        this.estado = estado;
    }

    public Estudiante(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", Persona=" + super.toString() + "]";
    }
    
}
