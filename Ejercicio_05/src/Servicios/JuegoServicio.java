/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Excepciones.Input_Mis_Match_Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class JuegoServicio {

    private Scanner teclado;

    public Juego crearJuego() {
        Juego game = new Juego();

        return game;
    }

    public Juego crearJuegoArreglado(int n) throws Input_Mis_Match_Exception {
        Juego game = new Juego(n);
        return game;
    }

    public String jugar(Juego game) {

        int num,
                numBuscado;
        teclado = new Scanner(System.in);

        numBuscado = game.getNum();

        try {
            
            System.out.print("Ingrese numero: ");
            num = teclado.nextInt();

            if (num == numBuscado) {
                
                game.setMensaje("Exito");
            } else {
                if (num <= numBuscado) {
                    
                    game.setMensaje("Numero Bajo");
                } else {
                   
                    game.setMensaje("Numero Alto");
                }
            }

           return game.getMensaje();  
        } catch (InputMismatchException err) {
            Input_Mis_Match_Exception e = new Input_Mis_Match_Exception("Se ingreso un valor no numerico.");
            throw e;
        }finally {
            game.setCantIntentos(game.getCantIntentos() + 1);
           // return game.getMensaje();
        }

    }
}
