/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author Angie Sanabria
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Administrador")
public class Admin implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="name", nullable=false, length=250)
    private String name;
    
    @Column(name="email", nullable=false, length=45)
    private String email;
    
    @Column(name="password", nullable=false, length=45)
    private String password;
}
