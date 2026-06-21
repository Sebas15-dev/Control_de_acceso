package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Acudientes;
import com.example.ControAcceso.Repository.AcudientesRepository;

@Service
public class AcudienteService {
    
    @Autowired
    private AcudientesRepository acudientesRepository;

    public List<Acudientes> obtenerTodo(){
        return acudientesRepository.findAll();
    }

    public Acudientes guardar(Acudientes acudientes){
        return acudientesRepository.save(acudientes);
    }

    public void eliminar(Long documento){
        acudientesRepository.deleteById(documento);
    }
}
