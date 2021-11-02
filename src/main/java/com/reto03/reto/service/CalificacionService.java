/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Calificacion;
import com.reto03.reto.repository.CalificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Angie Sanabria
 */
@Service
public class CalificacionService {
    @Autowired
    private CalificacionRepository repositorioCalif;
    
    /**
     * Devuelve una lista con los registros de la tabla Calificacion.
     * @return la lista con los objetos Calificacion de la tabla Calificacion.
     */
    public List<Calificacion> getAllCalificaciones(){
        return repositorioCalif.findAll();
    }
    
    /**
     * Crea una nueva calificación en la tabla Calificacion.
     * @param calificacion la calificación que se creará.
     * @return el objeto Calificacion creado.
     */
    public Calificacion saveCalificacion(Calificacion calificacion){
        return repositorioCalif.save(calificacion);
    }
}