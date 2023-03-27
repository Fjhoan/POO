package Figura;
import java.util.*;

public class Circulo extends Figura{
    //Crear atributos 
    private float radio;
    private double area;
    //metodo constructor
    public Circulo(float radio) {
        this.radio = radio;
    } 
    //Crear metodos 
    public void calcularArea(){
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digíte el radio del circulo");
        radio = Lectura.nextFloat();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El área del circulo es de: " + area);
        Lectura.close();
    }


}
