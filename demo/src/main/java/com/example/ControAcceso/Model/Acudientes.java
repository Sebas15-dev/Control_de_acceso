package com.example.ControAcceso.Model;

public class Acudientes extends Personas {

    private String parentesco;

    public Acudientes(int documento, String tipoDocumento,
            String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido,
            String direccion, long telefono,
            String correo, String parentesco) {

        super(documento, tipoDocumento, primerNombre,
                segundoNombre, primerApellido,
                segundoApellido, direccion,
                telefono, correo);

        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
