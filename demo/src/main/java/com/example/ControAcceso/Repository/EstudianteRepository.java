package com.example.ControAcceso.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ControAcceso.Model.Estudiantes;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Long>{
    
}
