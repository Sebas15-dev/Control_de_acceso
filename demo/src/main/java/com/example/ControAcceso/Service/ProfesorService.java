package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Profesores;
import com.example.ControAcceso.Repository.ProfesoresRepository;

@Service
public class ProfesorService {

    @Autowired
    private ProfesoresRepository profesoresRepository;

    public List<Profesores> obtenertodos(){
        return profesoresRepository.findAll();
    }

    public Profesores guardar(Profesores profesores){
        return profesoresRepository.save(profesores);
    }

    public void eliminar(Long documento){
        profesoresRepository.deleteById(documento);
    }

}
