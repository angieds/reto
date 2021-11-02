/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Admin;
import com.reto03.reto.service.AdminService;
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
@RequestMapping("/api/Admin")
public class AdminController {
    /**
     * Instancear el servicio de Admin.
     */
    @Autowired
    private AdminService servicioAdmin;
    
    /**
     * Petición GET para API Admin.
     * @return lista de administradores encontrados.
     */
    @GetMapping("/all")
    public List <Admin> getAllAdmins(){
        return servicioAdmin.getAllAdmins();
    }
    
    /**
     * Petición POST para API Admin.
     * @param admin el objeto Json que se enviará.
     * @return código de estado de respuesta HTTP (201).
     */
    @PostMapping("/save")
    public ResponseEntity saveAdmin(@RequestBody Admin admin){
        servicioAdmin.saveAdmin(admin);
        
        return ResponseEntity.status(201).build();
    }
}