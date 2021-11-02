/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Auditorio;
import com.reto03.reto.service.AuditorioService;
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
@RequestMapping("/api/Audience")
public class AuditorioController {
    
    @Autowired
    private AuditorioService servicioAud;
    
   
    @GetMapping("/all")
    public List<Auditorio> getAllAuditorios(){
        return servicioAud.getAllAuditorios();
    }
    
    @PostMapping("/save")
    public ResponseEntity saveAuditorios(@RequestBody Auditorio auditorios){
        servicioAud.saveAuditorio(auditorios);
        
        return ResponseEntity.status(201).build();
    }
}