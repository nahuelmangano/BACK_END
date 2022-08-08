
package com.portfolio.portfolio_ArgentinaPrograma.Interface;

import com.portfolio.portfolio_ArgentinaPrograma.Entidad.Persona;
import java.util.List;




public interface IPersonaServicio {
    //bring person
    public List<Persona> getPersona();
    
    //save objet type PErsona
    public void savePersona(Persona persona);
            
    //delete objeto, busqueda por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}
