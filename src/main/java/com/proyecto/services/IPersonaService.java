/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.services;

import com.proyecto.entities.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona();
    
    public Persona crearPersona(Persona persona);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona(Long id);
    
    public void editarPersona(Persona persona);
}
