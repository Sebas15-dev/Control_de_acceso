package com.example.ControAcceso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ControAcceso.Model.Asistencias;

@Repository
public interface AsistenciasRepository extends JpaRepository<Asistencias,Long> {
    
}
