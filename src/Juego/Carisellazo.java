package Juego;

import java.util.*;

public class Carisellazo implements Juego {

 //Creación de atributos
 private int moneda;
 private String jugador;
 private int eleccion;
 
 //objetos para capturar datos y generar un algoritmo aleatorio
 Scanner Lectura = new Scanner(System.in);
 Random Random = new Random();

     //solicitar los datos
    public void iniciar() {
        System.out.println("Ingrese su nombre jugador");
        jugador = Lectura.next();
    }

    
    public void jugar() {
        System.out.println(jugador + " \n " + " Realice su elección \n1.Cara \n2. Sello");
        eleccion = Lectura.nextInt();
        moneda = Random.nextInt(2)+1;
        System.out.println("se ha lanzado la moneda, Moneda girando...");
    }


    public void finalizar() {
        if(moneda == 1 && eleccion == 1){
        System.out.println("Cayó cara, Ganaste " + jugador);
        }else if(moneda == 2 && eleccion == 2){
            System.out.println("Cayó sello, Ganaste " + jugador);
        }else if(moneda == 1 && eleccion == 2){
            System.out.println("Cayó cara, Perdiste " + jugador);
        }else if(moneda == 2 && eleccion == 1){
            System.out.println("Cayó sello, Perdiste " + jugador);
        }
    }
    
}