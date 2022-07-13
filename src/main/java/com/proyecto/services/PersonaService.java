package com.proyecto.services;

import com.proyecto.entities.Persona;
import com.proyecto.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();

    }

    @Override
    public Persona crearPersona(Persona persona) {
        return persoRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona persona) {
        persoRepo.save(persona);
    }

}
