package Figura;
import java.util.*;

public class Cuadrado extends Figura{
    //crear atributos
    private float lado;
    private float area;
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    //crear metodos
    public void calcularArea(){
        Scanner Lectura = new Scanner(System.in);
        System.out.println("digíte el valor de uno de los lados del cuadrado");
        lado = Lectura.nextFloat();
        area = (float) Math.pow(lado,  2);
        System.out.println("El área del cuadrado es: " + area);
        Lectura.close();
    }
}
