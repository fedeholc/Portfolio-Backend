
package com.portfolio.SpringBoot.controller;
import com.portfolio.SpringBoot.model.Educa;
import com.portfolio.SpringBoot.model.Idioma;
import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.model.Proyecto;
import com.portfolio.SpringBoot.model.Skill;
import com.portfolio.SpringBoot.model.Trabajo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.SpringBoot.service.IPortfolioService;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders="*")
@RestController
public class Controller {

    
    
    @Autowired
    private IPortfolioService portfolioServ;
    
    
    // AGREGAR
    @PostMapping("/new/persona")
    @ResponseBody
    public Persona agregarPersona(@RequestBody Persona pers){
        return portfolioServ.crearPersona(pers);
    }
    
    @PostMapping("/new/educa")
    @ResponseBody
    public Educa agregarEduca(@RequestBody Educa edu){
        return portfolioServ.crearEduca(edu);
    }
        
    @PostMapping("/new/trabajo")
    @ResponseBody
    public Trabajo agregarTrabajo(@RequestBody Trabajo trab){
        return portfolioServ.crearTrabajo(trab);
    }
    
    @PostMapping("/new/idioma")
    @ResponseBody
    public Idioma agregarIdioma(@RequestBody Idioma idio){   
        return portfolioServ.crearIdioma(idio);
    }
    
    @PostMapping("/new/proyecto")
    @ResponseBody
    public Proyecto agregarProyecto(@RequestBody Proyecto proy){
         return portfolioServ.crearProyecto(proy);
    }
    
    @PostMapping("/new/skill")
    @ResponseBody
    public Skill agregarTrabajo(@RequestBody Skill skill){
        return portfolioServ.crearSkill(skill);
    }
    
 
    //MODIFICAR
    @PutMapping("/modificar/persona")
    @ResponseBody
     public Persona modificarPersona(@RequestBody Persona per) {
        return portfolioServ.modificarPersona(per);
    }
     
    @PutMapping("/modificar/educa")
    @ResponseBody
     public Educa modificarEduca(@RequestBody Educa edu) {
        return portfolioServ.modificarEduca(edu);
    }
     
    @PutMapping("/modificar/trabajo")
    @ResponseBody
     public Trabajo modificarTrabajo(@RequestBody Trabajo tra) {
        return portfolioServ.modificarTrabajo(tra);
    }
     
    @PutMapping("/modificar/skill")
    @ResponseBody
     public Skill modificarSkill(@RequestBody Skill skill) {
        return portfolioServ.modificarSkill(skill);
    }
     
    @PutMapping("/modificar/idioma")
    @ResponseBody
     public Idioma modificarIdioma(@RequestBody Idioma idio) {
        return portfolioServ.modificarIdioma(idio);
    }
     
    @PutMapping("/modificar/proyecto")
    @ResponseBody
    public Proyecto modificarProyecto(@RequestBody Proyecto proy) {
    return portfolioServ.modificarProyecto(proy);
    }
   
      
     
    // VER
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
         return portfolioServ.verPersonas();
    }
    
    @GetMapping ("/ver/educa")
    @ResponseBody
    public List<Educa> verEduca() {
         return portfolioServ.verEduca();
    }
    
    @GetMapping ("/ver/trabajo")
    @ResponseBody
    public List<Trabajo> verTrabajo() {
        return portfolioServ.verTrabajo();
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return portfolioServ.verProyecto();
    }
    
    @GetMapping ("/ver/idioma")
    @ResponseBody
    public List<Idioma> verIdioma() {
        return portfolioServ.verIdioma();
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return portfolioServ.verSkill();
    }
    
    
    // BORRAR
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        portfolioServ.borrarPersona(id);
    }
    
    @DeleteMapping("/delete/educa/{id}")
    public void borrarEduca(@PathVariable Long id) {
        portfolioServ.borrarEduca(id);
    }
    
    @DeleteMapping("/delete/trabajo/{id}")
    public void borrarTrabajo(@PathVariable Long id) {
        portfolioServ.borrarTrabajo(id);
    }
    @DeleteMapping("/delete/idioma/{id}")
    public void borrarIdioma(@PathVariable Long id) {
        portfolioServ.borrarIdioma(id);
    }
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        portfolioServ.borrarProyecto(id);
    }
    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill(@PathVariable Long id) {
        portfolioServ.borrarSkill(id);
    }
}
