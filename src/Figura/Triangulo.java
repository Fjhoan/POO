package Figura;

import java.util.Scanner;

public class Triangulo extends Figura{
    //crear los atributos
    private float area;
    private float base;
    private float altura;
    //crear metodo constructor
        public Triangulo(float area, float base, float altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }
    //crear los metodos
    public void calcularArea() {
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digíte el valor de la base");
        base = Lectura.nextFloat();
        System.out.println("Digíte el alto del tirangulo");
        altura = Lectura.nextFloat();
        area = (float) (base * altura) / 2;
        System.out.println("El área del triangulo es:" + area);
        Lectura.close();
    }


}
