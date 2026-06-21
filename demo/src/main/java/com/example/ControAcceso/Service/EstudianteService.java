package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Estudiantes;
import com.example.ControAcceso.Repository.EstudianteRepository;

@Service
public class EstudiantesService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    public List<Estudiantes> obtenerTodos(){
        return estudianteRepository.findAll();
    }

    public Estudiantes guardar(Estudiantes estudiante){
        return estudianteRepository.save(estudiante);
    }

    public void eliminar(Long documento){
        estudianteRepository.deleteById(documento);
    }

}
