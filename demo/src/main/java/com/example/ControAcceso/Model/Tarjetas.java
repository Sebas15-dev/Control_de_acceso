package com.example.ControAcceso.Model;

import java.time.LocalDate;

public class Tarjetas {

    private Long codigoTarjeta;
    private String estado;
    private LocalDate fechaAsignacion;
    private String documentoEstudiante;

    public Tarjetas(Long codigoTarjeta, String estado,
                   LocalDate fechaAsignacion,
                   String documentoEstudiante) {

        this.codigoTarjeta = codigoTarjeta;
        this.estado = estado;
        this.fechaAsignacion = fechaAsignacion;
        this.documentoEstudiante = documentoEstudiante;
    }

    public Long getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(Long codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }
}