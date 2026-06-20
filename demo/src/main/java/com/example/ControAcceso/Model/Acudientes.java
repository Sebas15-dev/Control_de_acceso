package com.example.ControAcceso.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Acudientes")
public class Acudientes extends Personas {

    @Column(name = "parentesco")
    private String parentesco;

    public Acudientes(){

    }

    public Acudientes(long documento, String tipoDocumento,
            String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido,
            String direccion, String telefono,
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
