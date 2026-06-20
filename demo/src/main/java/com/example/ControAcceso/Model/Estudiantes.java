package com.example.ControAcceso.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Estudiantes")
public class Estudiantes extends Personas {

    @Column(name = "fecha_de_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "genero")
    private String genero;

    @Column(name = "id_curso")
    private int curso;

    public Estudiantes(){
        
    }

    public Estudiantes(long documento, String tipoDocumento,
                       String primerNombre, String segundoNombre,
                       String primerApellido, String segundoApellido,
                       String direccion, String telefono,
                       String correo, LocalDate fechaNacimiento,
                       LocalDate fechaIngreso, String genero,
                       int curso) {

        super(documento, tipoDocumento, primerNombre,
              segundoNombre, primerApellido,
              segundoApellido, direccion,
              telefono, correo);
        
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.genero = genero;
        this.curso = curso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso= fechaIngreso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}