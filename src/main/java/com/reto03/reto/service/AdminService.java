/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Admin;
import com.reto03.reto.repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @Angie Sanabria
 */
@Service
public class AdminService {
    @Autowired
    private AdminRepository repositorioAdmin;
    
    /**
     * Devuelve una lista con los registros de la tabla Administrador.
     * @return la lista con los objetos Admin de la tabla Administrador.
     */
    public List<Admin> getAllAdmins(){
        return repositorioAdmin.findAll();
    }
    
    /**
     * Crea un nuevo administrador en la tabla Administrador.
     * @param admin el admin que se creará.
     * @return el objeto Admin creado.
     */
    public Admin saveAdmin(Admin admin){
        return repositorioAdmin.save(admin);
    }
}