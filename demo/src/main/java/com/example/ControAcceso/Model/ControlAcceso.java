package com.example.ControAcceso.Model;

import java.time.LocalDateTime;

public class ControlAcceso {

    private Long idControlAcceso;
    private Long documentoEstudiante;
    private LocalDateTime fecha;

    public ControlAcceso(Long idControlAcceso,
                         Long documentoEstudiante,
                         LocalDateTime fecha) {

        this.idControlAcceso = idControlAcceso;
        this.documentoEstudiante = documentoEstudiante;
        this.fecha = fecha;
    }

    public Long getIdControlAcceso() {
        return idControlAcceso;
    }

    public void setIdControlAcceso(Long idControlAcceso) {
        this.idControlAcceso = idControlAcceso;
    }

    public Long getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(Long documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}