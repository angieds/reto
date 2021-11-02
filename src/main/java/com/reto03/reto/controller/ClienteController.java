/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Cliente;
import com.reto03.reto.service.ClienteService;
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
@RequestMapping("/api/Client")
public class ClienteController {

    @Autowired
    private ClienteService servicioClientes;

    @GetMapping("/all")
    public List<Cliente> getAllClientes() {
    return servicioClientes.getAllClientes();
    }

    @PostMapping("/save")
    public ResponseEntity saveCliente(@RequestBody Cliente clientes) {
    servicioClientes.saveCliente(clientes);

    return ResponseEntity.status(201).build();
    
    }
}
