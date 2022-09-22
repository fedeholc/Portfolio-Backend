 
package com.portfolio.SpringBoot.model;
 
 
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
 

@Getter @Setter
@Entity
public class Trabajo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(nullable=false)
    private String lugar;
    
    @Column(nullable=false)
    private String periodo;
    
    @Column(nullable=false)
    private String puesto;
    
    @Column(nullable=false)
    private String descripcion;
    
    @Column(nullable=false)
    private String logo;
     

     
    public Trabajo () {
        
    }
    
    public Trabajo (Long id, String lugar, String periodo,
            String puesto, String descripcion, String logo) {
        this.id = id;
        this.lugar = lugar;
        this.periodo = periodo;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.logo = logo;

    }
}
