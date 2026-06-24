package com.example.ControAcceso.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.ControlAcceso;
import com.example.ControAcceso.Model.Tarjetas;
import com.example.ControAcceso.Repository.ControlAccesoRepository;

@Service
public class ControlAccesoService {

    @Autowired
    private ControlAccesoRepository controlAccesoRepository;

    @Autowired 
    private TarjetaService tarjetaService;

    public List<ControlAcceso> obtenerTodos() {
        return controlAccesoRepository.findAll();
    }

    public boolean registrarEntrada(Long codigoTarjeta){
        
        Tarjetas tarjeta = tarjetaService.buscTarjeta(codigoTarjeta);

        if (tarjeta == null){
            return false;
        }
        else{
            Long documentoEstudiante = tarjeta.getDocumentoEstudiante();
            ControlAcceso acceso = new ControlAcceso(documentoEstudiante, LocalDateTime.now());

            controlAccesoRepository.save(acceso);
            return true;
        }
    }
}
