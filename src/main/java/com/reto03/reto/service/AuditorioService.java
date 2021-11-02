/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Auditorio;
import com.reto03.reto.repository.AuditorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Angie Sanabria
 */
@Service
public class AuditorioService {
    @Autowired
    private AuditorioRepository repositorioAud;
    
    /**
     * Devuelve una lista con los registros de la tabla auditorio.
     * @return la lista con los objetos Auditorio de la tabla auditorio.
     */
    public List<Auditorio> getAllAuditorios(){
        return repositorioAud.findAll();
    }
    
    /**
     * Crea un nuevo auditorio en la tabla auditorio.
     * @param auditorio el auditorio que se creará.
     * @return un objeto Auditorio
     */
    public Auditorio saveAuditorio(Auditorio auditorio){
        return repositorioAud.save(auditorio);
    }
}