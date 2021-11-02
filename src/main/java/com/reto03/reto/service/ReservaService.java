/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Reserva;
import com.reto03.reto.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Angie Sanabria
 */
@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repositorioReserva;
    
    /**
     * Devuelve una lista con los registros de la tabla Reserva.
     * @return la lista con los objetos Reserva de la tabla Reserva.
     */
    public List<Reserva> getAllReservas(){
        return repositorioReserva.findAll();
    }
    
    /**
     * Crea una nueva Reserva en la tabla Reserva.
     * @param reserva la reserva que se creará.
     * @return el objeto Reserva creado.
     */
    public Reserva saveReserva(Reserva reserva){
        return repositorioReserva.save(reserva);
    }
}