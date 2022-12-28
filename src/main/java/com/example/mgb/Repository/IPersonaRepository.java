
package com.example.mgb.Repository;

import com.example.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
