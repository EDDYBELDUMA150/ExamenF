/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.belduma.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author OWNER
 */
public interface GenericService <E, ID extends Serializable>{
    
    public List<E> findAll(Integer id);
    
    public void save(E entidad);
    
    public void delete(Integer id);
    
    public E update (Long id);
    
}
