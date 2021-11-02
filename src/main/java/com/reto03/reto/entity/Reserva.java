/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto03.reto.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name="Reserva")
public class Reserva implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idReservation")
    private int idReservation;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar devolutionDate;
    
    @Column(name="status", nullable=false, length=45)
    private String status="created";
    
    @ManyToOne(optional=false)
    @JoinColumn(name="Auditorio_id", nullable=false)
    @JsonIgnoreProperties("reservations")
    private Auditorio audience;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="Cliente_id", nullable=false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Cliente client;
    
    private Calificacion score;
}
