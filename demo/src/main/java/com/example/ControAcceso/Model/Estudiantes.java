package com.example.ControAcceso.Model;

import java.time.LocalDate;

public class Estudiantes extends Personas {

    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private String genero;
    private String codigoTarjeta;
    private String curso;

    public Estudiantes(int documento, String tipoDocumento,
                       String primerNombre, String segundoNombre,
                       String primerApellido, String segundoApellido,
                       String direccion, long telefono,
                       String correo, LocalDate fechaNacimiento,
                       LocalDate fechaIngreso, String genero, String codigoTarjeta,
                       String curso) {

        super(documento, tipoDocumento, primerNombre,
              segundoNombre, primerApellido,
              segundoApellido, direccion,
              telefono, correo);
        
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.genero = genero;
        this.codigoTarjeta = codigoTarjeta;
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

    public String getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(String codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}