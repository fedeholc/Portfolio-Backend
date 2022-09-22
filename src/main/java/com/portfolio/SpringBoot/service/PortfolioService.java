package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educa;
import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.model.Trabajo;
import com.portfolio.SpringBoot.model.Skill;
import com.portfolio.SpringBoot.model.Idioma;
import com.portfolio.SpringBoot.model.Proyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.SpringBoot.repository.PersonaRepository;
import com.portfolio.SpringBoot.repository.EducaRepository;
import com.portfolio.SpringBoot.repository.IdiomaRepository;
import com.portfolio.SpringBoot.repository.ProyectoRepository;
import com.portfolio.SpringBoot.repository.SkillRepository;
import com.portfolio.SpringBoot.repository.TrabajoRepository;



@Service
public class PortfolioService implements IPortfolioService {

    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Autowired
     public EducaRepository educaRepo;
    
    @Autowired
    public TrabajoRepository trabajoRepo;

    @Autowired
    public SkillRepository skillRepo;
        
    @Autowired
    public IdiomaRepository idiomaRepo;
            
    @Autowired
    public ProyectoRepository proyectoRepo;
    
      
    // PERSONA
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }
    @Override
    public Persona crearPersona(Persona per) {
        return persoRepo.save(per);
    }
    @Override
    public Persona modificarPersona(Persona per) {
        return persoRepo.save(per);
    }
    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }    
    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    // EDUCA
    @Override
    public List<Educa> verEduca() {
        return educaRepo.findAll();
    }
    @Override
    public Educa crearEduca (Educa edu) {
        return educaRepo.save(edu);
    }
    @Override
    public Educa modificarEduca (Educa edu) {
        return educaRepo.save(edu);
    }
    
    @Override
    public void borrarEduca(Long id) {
        educaRepo.deleteById(id);
    }
    
     
    // TRABAJO
    @Override
    public List<Trabajo> verTrabajo() {
        return trabajoRepo.findAll();
    }
    @Override
    public Trabajo crearTrabajo (Trabajo tra) {
        return trabajoRepo.save(tra);
        
    }
    @Override
    public Trabajo modificarTrabajo (Trabajo tra) {
        return trabajoRepo.save(tra);
    }
    @Override
    public void borrarTrabajo(Long id) {
        trabajoRepo.deleteById(id);
    }


        // proyecto
    @Override
    public List<Proyecto> verProyecto() {
        return proyectoRepo.findAll();
    }
    @Override
    public Proyecto crearProyecto (Proyecto proy) {
        return proyectoRepo.save(proy);
        
    }
    @Override
    public Proyecto modificarProyecto (Proyecto proy) {
        return proyectoRepo.save(proy);
    }
    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
    
            // Idioma
    @Override
    public List<Idioma> verIdioma() {
        return idiomaRepo.findAll();
    }
    @Override
    public Idioma crearIdioma (Idioma idio) {
        return idiomaRepo.save(idio);
        
    }
    @Override
    public Idioma modificarIdioma (Idioma idio) {
        return idiomaRepo.save(idio);
    }
    @Override
    public void borrarIdioma(Long id) {
        idiomaRepo.deleteById(id);
    }
    
                // skill
    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }
    @Override
    public Skill crearSkill (Skill skill) {
        return skillRepo.save(skill);
        
    }
    @Override
    public Skill modificarSkill (Skill skill) {
        return skillRepo.save(skill);
    }
    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    
    
}
