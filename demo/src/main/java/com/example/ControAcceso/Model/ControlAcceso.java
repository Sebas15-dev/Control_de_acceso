package com.example.ControAcceso.Model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name="control_acceso")
public class ControlAcceso {

    @Id
    @Column(name = "id_control_acceso")
    private Long idControlAcceso;

    @Column(name = "documento_estudiante")
    private Long documentoEstudiante;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fecha;

    public ControlAcceso(){
        
    }

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