/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Mensaje;
import com.reto03.reto.repository.MensajeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Angie Sanabria
 */
@Service
public class MensajeService {
    @Autowired
    private MensajeRepository repositorioMensaje;
    
    /**
     * Devuelve una lista con los registros de la tabla Mensaje.
     * @return la lista con los objetos Mensaje de la tabla Mensaje.
     */
    public List<Mensaje> getAllMensajes(){
        return repositorioMensaje.findAll();
    }
    
    /**
     * Crea un nuevo mensaje en la tabla Mensaje.
     * @param mensaje el mensaje que se creará.
     * @return el objeto Mensaje creado.
     */
    public Mensaje saveMensaje(Mensaje mensaje){
        return repositorioMensaje.save(mensaje);
    }
}
