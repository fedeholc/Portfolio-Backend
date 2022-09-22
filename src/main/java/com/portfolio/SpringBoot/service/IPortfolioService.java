
package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educa;
import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.model.Skill;
import com.portfolio.SpringBoot.model.Trabajo;
import com.portfolio.SpringBoot.model.Idioma;
import com.portfolio.SpringBoot.model.Proyecto;
import java.util.List;


public interface IPortfolioService {
    
    public List<Persona> verPersonas();
    public Persona crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona modificarPersona (Persona per);
    public Persona buscarPersona (Long id);
    
    public List<Educa> verEduca();
    public Educa crearEduca (Educa edu);
    public Educa modificarEduca (Educa edu);
    public void borrarEduca (Long id);
    
    public List<Trabajo> verTrabajo();
    public Trabajo crearTrabajo (Trabajo tra);
    public Trabajo modificarTrabajo (Trabajo tra);
    public void borrarTrabajo (Long id);

    public List<Skill> verSkill();
    public Skill crearSkill (Skill skill);
    public Skill modificarSkill (Skill skill);
    public void borrarSkill (Long id);
    
    public List<Idioma> verIdioma();
    public Idioma crearIdioma (Idioma idio);
    public Idioma modificarIdioma (Idioma idio);
    public void borrarIdioma (Long id);
    
    public List<Proyecto> verProyecto();
    public Proyecto crearProyecto (Proyecto proy);
    public Proyecto modificarProyecto (Proyecto proy);
    public void borrarProyecto (Long id);
     
}
