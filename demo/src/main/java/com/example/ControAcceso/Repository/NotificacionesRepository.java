package com.example.ControAcceso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ControAcceso.Model.Notificaciones;

@Repository
public interface NotificacionesRepository extends JpaRepository<Notificaciones,Long>{
    
}
