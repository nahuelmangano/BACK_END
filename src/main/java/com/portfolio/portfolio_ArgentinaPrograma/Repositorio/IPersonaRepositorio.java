
package com.portfolio.portfolio_ArgentinaPrograma.Repositorio;

import com.portfolio.portfolio_ArgentinaPrograma.Entidad.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Integer> { 
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
