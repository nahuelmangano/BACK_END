
package com.portfolio.portfolio_ArgentinaPrograma.Repositorio;

import com.portfolio.portfolio_ArgentinaPrograma.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long> {
    
}
