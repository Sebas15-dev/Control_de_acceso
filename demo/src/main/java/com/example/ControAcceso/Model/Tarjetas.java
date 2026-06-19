package com.example.ControAcceso.Model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="Tarjetas")
public class Tarjetas {

    @Id
    @Column(name="codigo_tarjeta")
    private Long codigoTarjeta;

    @Column(name="estado")
    private String estado;

    @Column(name="fecha_asignacion")
    private LocalDate fechaAsignacion;

    @Column(name="documento_estudiante")
    private long documentoEstudiante;

    public Tarjetas(){
        
    }

    public Tarjetas(Long codigoTarjeta, String estado,
                   LocalDate fechaAsignacion,
                   long documentoEstudiante) {

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

    public long getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(long documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }
}