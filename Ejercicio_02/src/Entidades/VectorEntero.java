/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;



/**
 *
 * @author Alejandro Birolo
 */
public class VectorEntero {
    private int vector[];

    public VectorEntero() {
    }

    public VectorEntero(int tam) {
        this.vector = new int [tam];
        
        for (int i=0 ; i<tam; i++) {
              this.vector[i]=0;
        }
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector, int elem, int pos) {
        this.vector[pos] = elem;
    }

    @Override
    public String toString() {
        return "VectorEntero{" + "vector=" + Arrays.toString(vector) + '}';
    }

    
    
    
    
}
