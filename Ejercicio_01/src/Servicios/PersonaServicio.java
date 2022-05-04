/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import Excepciones.PersonaException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class PersonaServicio  {
    
    Scanner teclado;
    
    public Persona crearPersona(){
        Persona p1;
        teclado = new Scanner(System.in);
                
        System.out.print("Ingrese edad: ");
        p1 = new Persona (teclado.nextInt());
        
        return p1;
    }
    
    public boolean esMayorDeEdad (Persona p) throws PersonaException {
        
        try{
           if (p == null)
            throw new PersonaException ("No se creo el objeto Persona");
       
        if (p.getEdad() > 70)
            return true;
        return false; 
        }catch(PersonaException e){
            throw e;
        }
        catch (Exception er){
            throw er;
        }
            
        
    }
}
