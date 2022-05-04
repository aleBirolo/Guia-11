/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.DivisionNumero;
import Excepciones.DivisionNumeroException;
import Servicios.DivisionNumeroServicio;
import java.util.InputMismatchException;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DivisionNumero div;
        DivisionNumeroServicio ds;
        
        ds= new DivisionNumeroServicio();
        
        try{
            div = ds.crearDivisionNumero();
            System.out.println( div.getNum1() + " / " + div.getNum2() + " = " + ds.dividir(div) );
            System.out.println(div);
        }catch (DivisionNumeroException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e2){
            System.out.println(e2.getMessage());
        }catch(Exception err2){
        System.out.println("Error del sistema");
        }
      
    }
}
