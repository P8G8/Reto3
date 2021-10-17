/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.reto3p8g8.controller;

import com.reto3.reto3p8g8.entidad.Games;
import com.reto3.reto3p8g8.servicio.GamesServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego.Ramirez
 * Creado el 10.10.2021
 * Capa que sirve para crear la api
 * Cuando se despliega el embebido se ejecuta
 */
@RestController 
@RequestMapping("/api/Games")


public class GamesController {
    @Autowired
    private GamesServicio service;
    
    @GetMapping("/all")
    public List<Games> findAllGames(){
        return service.getGamesAll();
                
    }
    
    @PostMapping("/save")
    public ResponseEntity addGames(@RequestBody Games games){
        service.saveGamesAll(games);
        return ResponseEntity.status(201).build();
    
    }
    
        @PutMapping("/update")
        public ResponseEntity updateGames(@RequestBody Games games){
            service.UpdateGames(games);
            return ResponseEntity.status(201).build();
        }    
    
        @DeleteMapping("/delete")    
            public ResponseEntity deleteGames(@RequestBody Games games){
            service.deleteGames(games.getId());
            return ResponseEntity.status(204).build();
    }
}
