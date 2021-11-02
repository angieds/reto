/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.service;

import com.reto03.reto.entity.Category;
import com.reto03.reto.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Angie Sanabria
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repositorioCategory;
    
    /**
     * Devuelve una lista con los registros de la tabla Categoria.
     * @return la lista con los objetos Category de la tabla Categoria.
     */
    public List<Category> getAllCategorias(){
        return repositorioCategory.findAll();
    }
    
    /**
     * Crea una nueva categoria en la tabla Categoria.
     * @param categoria la categoría que se creará.
     * @return un objeto Category
     */
    public Category saveCategoria(Category categoria){
        return repositorioCategory.save(categoria);
    }
}