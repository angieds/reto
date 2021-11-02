/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Calificacion;
import com.reto03.reto.service.CalificacionService;
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
@RequestMapping("/api/Score")
public class CalificacionController {
    /**
     * Instancear el servicio de Calificacion.
     */
    @Autowired
    private CalificacionService servicioCalif;
    
    /**
     * Petición GET para API Score.
     * @return lista de calificaciones encontradas.
     */
    @GetMapping("/all")
    public List<Calificacion> getAllCalificaciones(){
        return servicioCalif.getAllCalificaciones();
    }
    
    /**
     * Petición POST para API Score.
     * @param calificacion el objeto Json que se enviará.
     * @return código de estado de respuesta HTTP (201).
     */
    @PostMapping("/save")
    public ResponseEntity saveCalificacion(@RequestBody Calificacion calificacion){
        servicioCalif.saveCalificacion(calificacion);
        
        return ResponseEntity.status(201).build();
    }
}