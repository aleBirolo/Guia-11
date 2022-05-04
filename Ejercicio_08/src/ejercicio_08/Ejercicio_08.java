/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_08;

import Entidades.Dos;
import Entidades.Tres;
import Entidades.Uno;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_08 {

    // Para la clase Uno
    public static void main(String[] args) {
        Uno uno = new Uno();
        Dos dos = new Dos();
        Tres tres = new Tres();
        
        System.out.println(" Estoy en Tres\n");
        try {
            System.out.println(tres.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() Tres") ;
            e.printStackTrace();
        }
        
        System.out.println("\n\n Estoy en Dos\n");
        try {
            System.out.println(dos.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() Dos") ;
            e.printStackTrace();
        }
        
        System.out.println("\n\nEstoy en Uno\n");
        try {
            System.out.println(uno.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() Uno") ;
            e.printStackTrace();
        }
        
        
        
        
    }
    

    
}
