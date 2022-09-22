 
package com.portfolio.SpringBoot.model;
 
 
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
 

@Getter @Setter
@Entity
public class Proyecto {
      @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(nullable=false)
    private String nombre;
     
    @Column(nullable=false)
    private String descripcion;

    @Column(nullable=false)
    private String enlace;
    
    @Column(nullable=false)
    private String logo;
     
  
    public Proyecto () {
        
    }
 
    public Proyecto (Long id, String nombre, String descripcion, String enlace, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.logo = logo;
 
    }
}
