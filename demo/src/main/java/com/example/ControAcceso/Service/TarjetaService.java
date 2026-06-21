package com.example.ControAcceso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControAcceso.Model.Tarjetas;
import com.example.ControAcceso.Repository.TarjetasRepository;

@Service
public class TarjetaService {

    @Autowired
    private TarjetasRepository tarjetasRepository;

    public List<Tarjetas> mostrarTodo(){
        return tarjetasRepository.findAll();
    }

    public Tarjetas crearTarjetas(Tarjetas tarjetas){
        return tarjetasRepository.save(tarjetas);
    }

    public void eliminarTarjeta(Long codigoTarjeta){
        tarjetasRepository.deleteById(codigoTarjeta);
    }
    
}
