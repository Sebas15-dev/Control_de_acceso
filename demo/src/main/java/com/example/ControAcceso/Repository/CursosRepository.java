package com.example.ControAcceso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ControAcceso.Model.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long>{
    
}
