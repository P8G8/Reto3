/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.reto3p8g8.servicio;

import com.reto3.reto3p8g8.entidad.Games;
import com.reto3.reto3p8g8.repositorio.GamesRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego.Ramirez
 * Creado el 09.10.2021
 * Operaciones básicas, intermediario entre controlador y el repositorio
 * 
 */
@Service

public class GamesServicio {
    @Autowired
    private GamesRepositorio repository;

    /**
    * Operaciones Basicas GET o CREATE
    * @author Diego.Ramirez
    * Creado el 09.10.2021
    * Guardar y crear todos los games
    */
    public Games saveGamesAll(Games games){
        return repository.save(games);
    }
    
    
    
    
/**
 * Operaciones Basicas POST o READ
 * @author Diego.Ramirez
 * Creado el 09.10.2021
 * Mostrar todos los games
 * 
 */
    public List<Games> getGamesAll(){
        return repository.findAll();
    }
 
    /**
    * Operaciones Basicas PUT o UPDATE
    * @author Diego.Ramirez
    * Creado el 10.10.2021
    * Actualizar todos los games desde al JSON, si encuentra con finById, sino que coloque null
    * si existe el elemento lo lleva a cambiarlo, ajustarlo o repisarlo
    */
    public Games UpdateGames(Games games){
        Games existeGames=repository.findById(games.getId()).orElse(null);
        existeGames.setCategory_id(games.getCategory_id());
        existeGames.setDeveloper(games.getDeveloper());
        existeGames.setMinage(games.getMinage());
        existeGames.setName(games.getName());
        return repository.save(existeGames);
    
    }
 
    /**
    * Operaciones Basicas Eliminar o DELETE
    * @author Diego.Ramirez
    * Creado el 10.10.2021
    * Eliminar todos los games desde al JSON, si encuentra con finById, sino que coloque null
    * si existe el elemento lo lleva a cambiarlo, ajustarlo o repisarlo
    */
    public String deleteGames(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    
    }


}
