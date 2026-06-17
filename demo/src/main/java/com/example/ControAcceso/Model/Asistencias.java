package com.example.ControAcceso.Model;

import java.time.LocalDateTime;

public class Asistencias {

    private Long idAsistencia;
    private LocalDateTime fecha;
    private String estado;
    private String documentoProfesor;
    private String documentoEstudiante;

    public Asistencias() {

    }

    public Asistencias(Long idAsistencia,
            LocalDateTime fecha,
            String estado,
            String documentoProfesor,
            String documentoEstudiante) {

        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.estado = estado;
        this.documentoProfesor = documentoProfesor;
        this.documentoEstudiante = documentoEstudiante;
    }

    public Long getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(Long idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDocumentoProfesor() {
        return documentoProfesor;
    }

    public void setDocumentoProfesor(String documentoProfesor) {
        this.documentoProfesor = documentoProfesor;
    }

    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }
}