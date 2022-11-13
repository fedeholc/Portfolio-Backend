
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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders="*")
@RestController
public class Controller {

    
    
    @Autowired
    private IPortfolioService portfolioServ;
    
    
    // AGREGAR
    @Operation(summary = "Crea una persona nueva")
    @PostMapping("/new/persona")
    @ResponseBody
    public Persona agregarPersona(@RequestBody Persona pers){
        return portfolioServ.crearPersona(pers);
    }
    
    @Operation(summary = "Crea un nuevo ítem del componente educación")
    @PostMapping("/new/educa")
    @ResponseBody
    public Educa agregarEduca(@RequestBody Educa edu){
        return portfolioServ.crearEduca(edu);
    }
        
    @Operation(summary = "Crea un nuevo ítem del componente experiencia laboral")
    @PostMapping("/new/trabajo")
    @ResponseBody
    public Trabajo agregarTrabajo(@RequestBody Trabajo trab){
        return portfolioServ.crearTrabajo(trab);
    }
    
    @Operation(summary = "Crea un nuevo ítem del componente idiomas")
    @PostMapping("/new/idioma")
    @ResponseBody
    public Idioma agregarIdioma(@RequestBody Idioma idio){   
        return portfolioServ.crearIdioma(idio);
    }
    
    @Operation(summary = "Crea un nuevo ítem del componente proyectos")
    @PostMapping("/new/proyecto")
    @ResponseBody
    public Proyecto agregarProyecto(@RequestBody Proyecto proy){
         return portfolioServ.crearProyecto(proy);
    }
    
    @Operation(summary = "Crea un nuevo ítem del componente skills")
    @PostMapping("/new/skill")
    @ResponseBody
    public Skill agregarTrabajo(@RequestBody Skill skill){
        return portfolioServ.crearSkill(skill);
    }
    
 
    //MODIFICAR
    @Operation(summary = "Modifica los datos de la persona")
    @PutMapping("/modificar/persona")
    @ResponseBody
     public Persona modificarPersona(@RequestBody Persona per) {
        return portfolioServ.modificarPersona(per);
    }
    
    @Operation(summary = "Modifica los datos de un ítem (según Id) del componente educación")
    @PutMapping("/modificar/educa")
    @ResponseBody
     public Educa modificarEduca(@RequestBody Educa edu) {
        return portfolioServ.modificarEduca(edu);
    }

    @Operation(summary = "Modifica los datos de un ítem (según Id) del componente trabajo")
    @PutMapping("/modificar/trabajo")
    @ResponseBody
     public Trabajo modificarTrabajo(@RequestBody Trabajo tra) {
        return portfolioServ.modificarTrabajo(tra);
    }
  
    @Operation(summary = "Modifica los datos de un ítem (según Id) del componente skills")
    @PutMapping("/modificar/skill")
    @ResponseBody
     public Skill modificarSkill(@RequestBody Skill skill) {
        return portfolioServ.modificarSkill(skill);
    }
    
    @Operation(summary = "Modifica los datos de un ítem (según Id) del componente idiomas")
    @PutMapping("/modificar/idioma")
    @ResponseBody
     public Idioma modificarIdioma(@RequestBody Idioma idio) {
        return portfolioServ.modificarIdioma(idio);
    }
    
    @Operation(summary = "Modifica los datos de un ítem (según Id) del componente proyectos")
    @PutMapping("/modificar/proyecto")
    @ResponseBody
    public Proyecto modificarProyecto(@RequestBody Proyecto proy) {
    return portfolioServ.modificarProyecto(proy);
    }
   
      
     
    // VER
    @Operation(summary = "Obtiene los datos de la persona")
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
         return portfolioServ.verPersonas();
    }
    
    @Operation(summary = "Obtiene los ítems del componente educación de la persona")
    @GetMapping ("/ver/educa")
    @ResponseBody
    public List<Educa> verEduca() {
         return portfolioServ.verEduca();
    }
    
    @Operation(summary = "Obtiene los ítems del componente trabajo de la persona")
    @GetMapping ("/ver/trabajo")
    @ResponseBody
    public List<Trabajo> verTrabajo() {
        return portfolioServ.verTrabajo();
    }
    
    @Operation(summary = "Obtiene los ítems del componente proyectos de la persona")
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return portfolioServ.verProyecto();
    }
    
    @Operation(summary = "Obtiene los ítems del componente idiomas de la persona")
    @GetMapping ("/ver/idioma")
    @ResponseBody
    public List<Idioma> verIdioma() {
        return portfolioServ.verIdioma();
    }
    
    @Operation(summary = "Obtiene los ítems del componente skills de la persona")
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return portfolioServ.verSkill();
    }
    
    
    // BORRAR
    @Operation(summary = "Borra a la persona especificada en id")
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@Parameter(description = "id de la persona a ser eliminada")  
        @PathVariable Long id) {
        portfolioServ.borrarPersona(id);
    }
    
    @Operation(summary = "Borra el ítem del componente educación especificado en id")
    @DeleteMapping("/delete/educa/{id}")
    public void borrarEduca(@Parameter(description = "id del ítem a ser eliminado")
        @PathVariable Long id) {
        portfolioServ.borrarEduca(id);
    }
    
    @Operation(summary = "Borra el ítem del componente trabajo especificado en id")
    @DeleteMapping("/delete/trabajo/{id}")
    public void borrarTrabajo(@Parameter(description = "id del ítem a ser eliminado")
        @PathVariable Long id) {
        portfolioServ.borrarTrabajo(id);
    }
    
    @Operation(summary = "Borra el ítem del componente idioma especificado en id")
    @DeleteMapping("/delete/idioma/{id}")
    public void borrarIdioma(@Parameter(description = "id del ítem a ser eliminado")
        @PathVariable Long id) {
        portfolioServ.borrarIdioma(id);
    }
    
    @Operation(summary = "Borra el ítem del componente proyecto especificado en id")
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@Parameter(description = "id del ítem a ser eliminado")
        @PathVariable Long id) {
        portfolioServ.borrarProyecto(id);
    }
    
    @Operation(summary = "Borra el ítem del componente skill especificado en id")
    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill(@Parameter(description = "id del ítem a ser eliminado")
        @PathVariable Long id) {
        portfolioServ.borrarSkill(id);
    }
}
