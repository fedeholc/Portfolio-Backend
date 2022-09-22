 
package com.portfolio.SpringBoot.model;
 
 
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
 

@Getter @Setter
@Entity
public class Educa {
    
 
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(nullable=false)
    private String institucion;
    
    @Column(nullable=false)
    private String titulo;
    
    @Column(nullable=false)
    private String logo;
     
    @Column(nullable=false)
    private String periodo;

     
    public Educa () {
        
    }

    public Educa (Long id, String institucion, String titulo, String periodo, String logo) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.logo = logo;
        this.periodo = periodo;

    }
    
}


 