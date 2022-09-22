 
package com.portfolio.SpringBoot.repository;

 
import com.portfolio.SpringBoot.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface TrabajoRepository extends JpaRepository <Trabajo, Long> {  
    
}
