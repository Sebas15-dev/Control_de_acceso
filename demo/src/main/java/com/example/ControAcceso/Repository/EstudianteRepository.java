package com.example.ControAcceso.Repository;

import org.springframework.stereotype.Repository;
import org.*;

@Repository
public interface EstudianteRepository() extends JpaRepository<Estudiantes, long>{
    
}
