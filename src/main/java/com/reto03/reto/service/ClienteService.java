/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Cliente;
import com.reto03.reto.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Angie Sanabria
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repositorioCliente;
    
    /**
     * Devuelve una lista con los registros de la tabla Cliente.
     * @return la lista con los objetos Cliente de la tabla Cliente.
     */
    public List<Cliente> getAllClientes(){
        return repositorioCliente.findAll();
    }
    
    /**
     * Crea un nuevo cliente en la tabla Cliente.
     * @param cliente el cliente que se creará.
     * @return el objeto Cliente creado.
     */
    public Cliente saveCliente(Cliente cliente){
        return repositorioCliente.save(cliente);
    }
}