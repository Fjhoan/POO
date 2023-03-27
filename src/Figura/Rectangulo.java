package Figura;
import java.util.*;

public class Rectangulo extends Figura{
    // crear atributos
    private float base;
    private float altura;
    private float area;
    
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //crear los metodos
    public void calcularArea(){
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digíte el valor de la base");
        base = Lectura.nextFloat();
        System.out.println("Digíte la altura del rectangulo");
        altura = Lectura.nextFloat();
        area = base * altura;
        System.out.println("El área del rectangulo es: " + area);
        Lectura.close();
    }
}
