package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Cursos;
import com.example.ControAcceso.Repository.CursosRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursosRepository cursosRepository;

    public List<Cursos> cargarTodos() {
        return cursosRepository.findAll();
    }

    public Cursos guardarCurso(Cursos cursos){
        return cursosRepository.save(cursos);
    }

    public void eliminarCurso(Long idCurso){
        cursosRepository.deleteById(idCurso);
    }
}
