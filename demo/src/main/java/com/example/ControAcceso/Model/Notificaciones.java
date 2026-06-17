package com.example.ControAcceso.Model;

import java.time.LocalDateTime;

public class Notificaciones {

    private String idNotificacion;
    private int documentoEstudiante;
    private int documentoAcudiente;
    private LocalDateTime fechaEnvio;
    private String mensaje;
    private String estado;

    public Notificaciones(String idNotificacion, int documentoEstudiante,
            int documentoAcudiente, LocalDateTime fechaEnvio,
            String mensaje, String estado) {

        this.idNotificacion = idNotificacion;
        this.documentoEstudiante = documentoEstudiante;
        this.documentoAcudiente = documentoAcudiente;
        this.fechaEnvio = fechaEnvio;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public int getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(int documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public int getDocumentoAcudiente() {
        return documentoAcudiente;
    }

    public void setDocumentoAcudiente(int documentoAcudiente) {
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

}
