/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio_ArgentinaPrograma.Servicio;

import com.portfolio.portfolio_ArgentinaPrograma.Entidad.Educacion;
import com.portfolio.portfolio_ArgentinaPrograma.Repositorio.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
     REducacion rEducacion;
     
     public List<Educacion> list(){
         return rEducacion.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return rEducacion.findById(id);
     }
     
     public Optional<Educacion> getByNombreE(String nombreE){
         return rEducacion.findByNombreE(nombreE);
     }
     
     public void save(Educacion edu){
         rEducacion.save(edu);
     }
     
     public void delete(int id){
         rEducacion.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rEducacion.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rEducacion.existsByNombreE(nombreE);
     }
    
}
