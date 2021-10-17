/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.reto3p8g8.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Diego.Ramirez
 * Escrito el dia 09.10.2021
 * Mapeo de tabla Game 
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="game")

public class Game implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String developer;
    private int year;
/* Falta saber como se asocia*/
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @JoinColumn(name = "message_id")
    private Message message;
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    
}
