package Juego;
//La interfaz va implementar dos juegos
public interface Juego {
    //dentro de la interfaz solo se pueden implementar los métodos public o abstract
    //métodos en común de los dos juegos
    void jugar();
    void iniciar();
    void finalizar();

}
