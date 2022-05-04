/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.InputMismatchException;

/**
 *
 * @author Alejandro Birolo
 */
public class Input_Mis_Match_Exception  extends InputMismatchException{

    public Input_Mis_Match_Exception() {
    }

    public Input_Mis_Match_Exception(String string) {
        super(string);
    }
    
    
}
