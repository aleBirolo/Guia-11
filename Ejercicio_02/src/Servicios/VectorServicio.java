/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.VectorEntero;
import Excepciones.VectorException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class VectorServicio {
    
    Scanner teclado;
    
     public VectorEntero crearVector(){
         
        teclado = new Scanner(System.in); 
        VectorEntero vec;
        
        System.out.print("Ingrese Cantidad de elementos del vector: ");
        vec= new VectorEntero(teclado.nextInt());
        
        return vec;
        
    }
     
    public void insertarEnVector (VectorEntero vec) throws VectorException{
        
        int elem,
            pos;
        
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese Valor: ");
        elem= teclado.nextInt();
        
        System.out.print("Ingrese Posicion de insercion: ");
        pos= teclado.nextInt();
        
        try{
            if ( pos < 0 || pos >= vec.getVector().length)
                throw new VectorException ("Indice fuera de rango");
            
           vec.setVector(vec.getVector(), elem, pos);
        }catch(VectorException e){
            throw e;
        }catch(Exception err){
            throw err; 
        }
        
    }
}
