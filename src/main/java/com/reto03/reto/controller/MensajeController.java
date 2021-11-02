/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Mensaje;
import com.reto03.reto.service.MensajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author Angie Sanabria
 */
@RestController
@RequestMapping("/api/Message")
public class MensajeController {
    /**
     * Instancear el servicio de Mensaje.
     */
    @Autowired
    private MensajeService servicioMensaje;
    
    /**
     * Petición GET para API Message.
     * @return lista de mensajes encontrados.
     */
    @GetMapping("/all")
    public List <Mensaje> getAllMensajes(){
        return servicioMensaje.getAllMensajes();
    }
    
    /**
     * Petición POST para API Message.
     * @param mensaje el objeto Json que se enviará.
     * @return código de estado de respuesta HTTP (201).
     */
    @PostMapping("/save")
    public ResponseEntity saveMensaje(@RequestBody Mensaje mensaje){
        servicioMensaje.saveMensaje(mensaje);
        
        return ResponseEntity.status(201).build();
    }
}
