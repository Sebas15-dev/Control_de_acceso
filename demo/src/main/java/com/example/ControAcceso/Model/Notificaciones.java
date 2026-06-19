package com.example.ControAcceso.Model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name="Notificaciones")
public class Notificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_notificacion")
    private long idNotificacion;

    @Column(name="documento_estudiante")
    private long documentoEstudiante;

    @Column(name="documento_acudiente")
    private long documentoAcudiente;

    @Column(name="fecha_envio")
    private LocalDateTime fechaEnvio;

    @Column(name="mensaje")
    private String mensaje;

    @Column(name="estado")
    private String estado;

    @Column(name="documento_profesor")
    private long documentoProfesor;

    public Notificaciones(){

    }

    public Notificaciones(long documentoEstudiante,
            long documentoAcudiente, LocalDateTime fechaEnvio,
            String mensaje, String estado, long documentoProfesor) {

        this.documentoEstudiante = documentoEstudiante;
        this.documentoAcudiente = documentoAcudiente;
        this.fechaEnvio = fechaEnvio;
        this.mensaje = mensaje;
        this.estado = estado;
        this.documentoProfesor = documentoProfesor;
    }

    public long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public long getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(long documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public long getDocumentoAcudiente() {
        return documentoAcudiente;
    }

    public void setDocumentoAcudiente(long documentoAcudiente) {
        this.documentoAcudiente = documentoAcudiente;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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

}
