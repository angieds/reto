/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.controller;

import com.reto03.reto.entity.Category;
import com.reto03.reto.service.CategoryService;
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
@RequestMapping("/api/Category")
public class CategoryController {
    /**
     * Instancia de CategoryService.
     */
    @Autowired
    private CategoryService servicioCategory;
    
    /**
     * Petición GET para API Category.
     * @return lista de categorías encontradas.
     */
    @GetMapping("/all")
    public List<Category> getAllCategorias(){
        return servicioCategory.getAllCategorias();
    }
    
    /**
     * Petición POST para API Category.
     * @param categoria el objeto Json que se enviará.
     * @return código de estado de respuesta HTTP (201).
     */
    @PostMapping("/save")
    public ResponseEntity saveCategoria(@RequestBody Category categoria){
        servicioCategory.saveCategoria(categoria);
        
        return ResponseEntity.status(201).build();
    }
}