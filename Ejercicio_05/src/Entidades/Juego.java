/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Alejandro Birolo
 */
public class Juego {
    private int num;
    private int cantIntentos;
    private String mensaje;
    
    public Juego() {
        this.genNum(); 
        this.cantIntentos = 0;
        this.mensaje = "";
    }

    public Juego(int num) {
        this.num = num;
        this.cantIntentos = 0;
        this.mensaje = "";
    }

    public int getNum() {
        return num;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public String getMensaje() {
        return mensaje;
    }

    
    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Juego{" + "num=" + num + ", cantIntentos=" + cantIntentos + ", mensaje=" + mensaje + '}';
    }

    private void genNum(){
        Random r1 = new Random();
        this.num = (int) (r1.nextInt() % 10) ;
    }
    
    
}
