package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Notificaciones;
import com.example.ControAcceso.Repository.NotificacionesRepository;

@Service
public class NotificacionService {

    @Autowired 
    private NotificacionesRepository notificacionesRepository;

    public List<Notificaciones> cargarTodos(){
        return notificacionesRepository.findAll();
    }

    public Notificaciones guardar(Notificaciones notificaciones){
        return notificacionesRepository.save(notificaciones);
    }

    public void eliminar(Long id){
        notificacionesRepository.deleteById(id);
    }
    
}
