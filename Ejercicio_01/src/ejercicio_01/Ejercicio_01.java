/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidades.Persona;
import Excepciones.PersonaException;
import Servicios.PersonaServicio;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per ;
        PersonaServicio ps=new PersonaServicio();
        
      //  per=ps.crearPersona();
        per=null;
        
        try {
            //ps.esMayorDeEdad(per);
            if (ps.esMayorDeEdad(per))
                System.out.println("Verdadero");
             else
                System.out.println("Falso");
            
        }catch(PersonaException e){
            System.out.println(e.getMessage());
        }
        catch(Exception er){
            System.out.println("Error del sistema");
        }
        
    }
    
}
