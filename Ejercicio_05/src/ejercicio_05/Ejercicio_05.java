/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_05;

import Entidades.Juego;
import Excepciones.Input_Mis_Match_Exception;
import Servicios.JuegoServicio;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego game;
        JuegoServicio js = new JuegoServicio();
        String msj;

        game = js.crearJuego();

        try {
            msj = js.jugar(game);
            System.out.println(msj);

            while (msj.compareTo("Exito") != 0) {
                msj = js.jugar(game);
                System.out.println(msj);
            }

            System.out.println(game);
            
        } catch (Input_Mis_Match_Exception e) {
            System.out.println(e.getMessage());
            System.out.println(game);
        } catch (Exception err) {
            System.out.println("Error del sistema");
        }

    }

}
