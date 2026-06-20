package com.example.ControAcceso.Model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name="asistencias")
public class Asistencias {

    @Id
    @Column(name="id_asistencia")
    private Long idAsistencia;

    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column(name="estado")
    private String estado;

    @Column(name="documento_profesor")
    private long documentoProfesor;

    @Column(name="documento_estudiante")
    private long documentoEstudiante;

    public Asistencias(){
        
    }

    public Asistencias(Long idAsistencia,
            LocalDateTime fecha,
            String estado,
            long documentoProfesor,
            long documentoEstudiante) {

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

    public long getDocumentoProfesor() {
        return documentoProfesor;
    }

    public void setDocumentoProfesor(long documentoProfesor) {
        this.documentoProfesor = documentoProfesor;
    }

    public long getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(long documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }
}