/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.repository;

import com.proyecto.entities.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepo extends JpaRepository <Experiencia, Long>{
    
}