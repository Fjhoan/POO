package Juego;

import java.util.*;

public class PiedraPapelTijera implements Juego {

    private int maquinaNum;
    private String maquina;
    private String nombreJugador;
    private int opcionJugador;

    Scanner Lectura = new Scanner(System.in);
    Random Random = new Random();
    public void iniciar(){
        System.out.println("Bienvenido al juego de piedra, papel o tijera");
        System.out.println("Por favor diganos su nombre");
        nombreJugador = Lectura.next();
        System.out.println("Bienvenido " + nombreJugador);
    }

    public void jugar(){
        maquinaNum = Random.nextInt(3) + 1;
        switch(maquinaNum){
            case 1:
                maquina = "Piedra";
                break;
            case 2:
                maquina = "Papel";
                break;
            case 3:
                maquina = "Tijera";
                break;
        }
        System.out.println("Porfavor, seleccione una opción \n1.Piedra \n2.Papel \n3.Tijera");
        opcionJugador = Lectura.nextInt();
    }

    public void finalizar(){
        System.out.println("La maquina saco: " + maquina);
        if (opcionJugador == maquinaNum) {
            System.out.println("Empataste con la maquina");
        }else if (opcionJugador == 1 && maquinaNum == 2 || opcionJugador == 2 && maquinaNum == 3 || opcionJugador == 3 && maquinaNum == 1) {
            System.out.println("Perdiste con la maquina");
        }else if (opcionJugador == 1 && maquinaNum == 3 || opcionJugador == 2 && maquinaNum == 1 || opcionJugador == 3 && maquinaNum == 2) {
            System.out.println("Ganaste contra la maquina");
        }
    }
}
