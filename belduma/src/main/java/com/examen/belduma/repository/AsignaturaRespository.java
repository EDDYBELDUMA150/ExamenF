/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.belduma.repository;

import com.examen.belduma.modelo.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author OWNER
 */

public interface AsignaturaRespository extends MongoRepository<Asignatura, Long>{
    
}
