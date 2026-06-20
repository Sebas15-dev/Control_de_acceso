package com.example.ControAcceso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ControAcceso.Model.ControlAcceso;

@Repository
public interface ControlAccesoRepository extends JpaRepository<ControlAcceso,Long>{
    
}
