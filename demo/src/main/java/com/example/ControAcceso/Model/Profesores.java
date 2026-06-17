package com.example.ControAcceso.Model;

public class Profesores extends Personas {

    public Profesores(int documento, String tipoDocumento,
            String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido,
            String direccion, long telefono,
            String correo) {

        super(documento, tipoDocumento, primerNombre,
                segundoNombre, primerApellido,
                segundoApellido, direccion,
                telefono, correo);
    }
}
