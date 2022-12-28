
package com.example.mgb.Interface;

import com.example.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Treaer una persona 
    public List<Persona> getPersona();
    //Traer persona
    public void savePersona(Persona persona);
    //Eliminar persona
    public void deletePersona (Long id);
    //Buscar persona 
    public Persona findPersona(Long id); 
    
}
