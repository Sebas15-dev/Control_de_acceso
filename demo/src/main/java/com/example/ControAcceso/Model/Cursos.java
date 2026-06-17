package com.example.ControAcceso.Model;

public class Cursos {

    private Long idCurso;
    private String grado;
    private String jornada;

    public Cursos(Long idCurso, String grado, String jornada) {
        this.idCurso = idCurso;
        this.grado = grado;
        this.jornada = jornada;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}