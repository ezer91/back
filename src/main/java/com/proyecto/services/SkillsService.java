/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.services;

import com.proyecto.entities.Skills;
import com.proyecto.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo){
        this.skillsRepo = skillsRepo;
    }
    
        public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    
    public List<Skills> buscarSkills(){
        return skillsRepo.findAll();
    }
    
    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    
    public void borrarSkills(Long id){
        skillsRepo.deleteById(id);
    }
}
