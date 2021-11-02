/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Reserva;
import com.reto03.reto.service.ReservaService;
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
@RequestMapping("/api/Reservation")
public class ReservaController {
    /**
     * Instancear el servicio de Reserva.
     */
    @Autowired
    private ReservaService servicioReserva;
    
    /**
     * Petición GET para API Reservation.
     * @return lista de Reservas encontrados.
     */
    @GetMapping("/all")
    public List <Reserva> getAllReservas(){
        return servicioReserva.getAllReservas();
    }
    
    /**
     * Petición POST para API Reservation.
     * @param reserva el objeto Json que se enviará.
     * @return código de estado de respuesta HTTP (201).
     */
    @PostMapping("/save")
    public ResponseEntity saveReserva(@RequestBody Reserva reserva){
        servicioReserva.saveReserva(reserva);
        
        return ResponseEntity.status(201).build();
    }
}