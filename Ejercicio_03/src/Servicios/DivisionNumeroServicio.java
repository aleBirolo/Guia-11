/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.DivisionNumero;
import Excepciones.DivisionNumeroException;
import Excepciones.DivisionNumeroException_Div_Zero;
import Excepciones.Input_Mis_Match_Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class DivisionNumeroServicio {
    
    Scanner teclado;
    
    public DivisionNumero crearDivisionNumero() throws DivisionNumeroException{
        
        teclado = new Scanner (System.in).useDelimiter("\n");
        DivisionNumero div;
        int n1,
            n2;
        
        try {
            
            System.out.print("Ingrese numero 1: ");
            n1 = Integer.parseInt(teclado.next());
          /*  
            System.out.print("Ingrese numero 2: ");
            n2 =Integer.parseInt(teclado.next());
           */
            System.out.print("Ingrese numero 2: ");
            n2 =Integer.parseInt(teclado.next());
            
            div = new DivisionNumero( n1, n2 );
            
            return div;
        }catch(NumberFormatException err){
            DivisionNumeroException e = new DivisionNumeroException("No se puede convertir a numero");
            throw  e;
        }catch (InputMismatchException err2){
            Input_Mis_Match_Exception e2 = new Input_Mis_Match_Exception("Ingreso incompatible con el tipo de dato definido");
            throw e2;
        }
         
    }
    
    public double dividir (DivisionNumero div)throws DivisionNumeroException_Div_Zero{
        
        try{
            if (div.getNum2()==0)
                throw new DivisionNumeroException_Div_Zero("No se puede dividir por cero");
            
            return (double) div.getNum1()/ div.getNum2();
        }catch(DivisionNumeroException_Div_Zero e){
            throw e;
        }
    }
    
}
