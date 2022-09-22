 
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Educa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EducaRepository extends JpaRepository <Educa, Long> {
    
}
