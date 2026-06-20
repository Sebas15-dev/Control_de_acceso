package com.example.ControAcceso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ControAcceso.Model.Acudientes;

@Repository
public interface AcudientesRepository extends JpaRepository<Acudientes, Long>{
    
}
