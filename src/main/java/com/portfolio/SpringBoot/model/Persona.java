 
package com.portfolio.SpringBoot.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String mail;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private String foto;
        @Column(nullable = false)
    private String ubicacion;
            @Column(nullable = false)
    private String banner;
 
 
    public Persona () {
        
    }
 
    public Persona (Long id, String nombre, String titulo,
            String mail, String descripcion, String foto, String ubicacion, String banner) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.mail = mail;
        this.descripcion = descripcion;
        this.foto = foto;
        this.ubicacion=ubicacion;
        this.banner=banner;
        
        
  }
    
}
