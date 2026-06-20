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
    private String documentoProfesor;

    @Column(name="documento_estudiante")
    private String documentoEstudiante;

    public Asistencias(){
        
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