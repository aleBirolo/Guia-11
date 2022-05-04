/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.VectorEntero;
import Excepciones.VectorException;
import Servicios.VectorServicio;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VectorEntero v ;
        VectorServicio vs = new VectorServicio();
        
        v= vs.crearVector();
        
        try{
            vs.insertarEnVector(v);
        }catch(VectorException e){
            System.out.println(e.getMessage());
        }catch(Exception err){
            System.out.println("Error del sistema");
        }
        
        System.out.println(v);
        
    }
    
}
