package com.example.ControAcceso.Model;

import java.time.LocalDateTime;

public class ControlAcceso {

    private Long id;
    private Long documentoEstudiante;
    private LocalDateTime fecha;

    public ControlAcceso(Long id,
                         Long documentoEstudiante,
                         LocalDateTime fecha) {

        this.id = id;
        this.documentoEstudiante = documentoEstudiante;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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