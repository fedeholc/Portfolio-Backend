 
package com.portfolio.SpringBoot.model;
 
 
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
 

@Getter @Setter
@Entity
public class Skill {
        @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(nullable=false)
    private String nombre;
    
    @Column(nullable=false)
    private int valor;
    
    @Column(nullable=false)
    private String logo;
     
 
    public Skill () {
        
    }
 
    public Skill (Long id, String nombre, int valor, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.logo = logo;
 
    }
}
