/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto03.reto.repository;

import com.reto03.reto.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Angie Sanabria
 */
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
    
}
