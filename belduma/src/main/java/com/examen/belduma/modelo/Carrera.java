/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.belduma.modelo;

import java.util.List;
import lombok.Data;

/**
 *
 * @author OWNER
 */
@Data
public class Carrera {
    private String nombre;
    private String descripcion; 
    private Periodo periodo;
}
