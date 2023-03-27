package Principal;
import Salud.*;
import java.util.*;
import Figura.*;
import Juego.*;

public class Inicio {
    public static void main(String[] args) {
        //Creando varibles de uso 
        int opcion;
        double valor1 = 0;
        double valor2 = 0;
        String resultado;
        double resultado2;
        String cargo = "";
        double valorHora = 0;
        double horasTrabajadas = 0;
        String departamento="";
        float lado = 0;        
        float area = 0;
        float base = 0;
        float altura = 0;
        float radio = 0;
        persona jhoan = new persona();
        Scanner Lectura = new Scanner(System.in);
        Cuadrado cuadrado = new Cuadrado(lado);
        Triangulo triangulo = new Triangulo( area,  base,  altura);
        Rectangulo rectangulo = new Rectangulo(base,  altura);
        Circulo circulo = new Circulo(radio);
        Carisellazo carisellazo = new Carisellazo();
        PiedraPapelTijera piedra = new PiedraPapelTijera();
        
        //Reto 1
        
        /*jhoan.solicitarDatos();
        jhoan.mostrarDatos();
        jhoan.calcularImc();
        jhoan.mayorEdad();*/
        
        //Reto 2
        
        /*System.out.println("digite su peso");
        valor1 = Lectura.nextDouble();
        System.out.println("digite su estatura");
        valor2 = Lectura.nextDouble();
        resultado = jhoan.calcularImc2(valor1, valor2);
        System.out.println(resultado);*/
        
        //Reto 3
        /*System.out.println("digite su cargo");   
        cargo = Lectura.next();
        System.out.println("digite el valor de la hora");
        valorHora = Lectura.nextDouble();
        System.out.println("digite la cantidad de horas trabajadas");
        horasTrabajadas = Lectura.nextDouble();
        System.out.println("digite el departamento");
        departamento = Lectura.next();
        empleado jorgEmpleado = new empleado(cargo,valorHora,horasTrabajadas,departamento);   
        jorgEmpleado.solicitarDatos();
        jorgEmpleado.mostrarDatosEmpleado();
        resultado2 = jorgEmpleado.calcularHonorarios(valorHora, horasTrabajadas);
        System.out.println("sus honorarios son: " + resultado2);*/
        
        //reto 4
        /*System.out.println("Digíte la opcion a la cual quiere saber su área");
        System.out.println("1. Cuadrado\n" + "2. Tríangulo\n" + "3. Rectángulo\n" + "4. Círculo");
        opcion = Lectura.nextInt();
        //Utiliza un swicth para seleccionar el area que quiere hallar
        switch (opcion) {
            case 1:
                cuadrado.calcularArea();
                break;
            case 2:
                triangulo.calcularArea();
                break;
            case 3:
                rectangulo.calcularArea();
                break;
            case 4:
                circulo.calcularArea();
                break;
        }*/
        
        //Reto 5
        //metodo de inicio, realización y finalización del juego carisellazo
        /*carisellazo.iniciar();
        carisellazo.jugar();
        carisellazo.finalizar();*/
        //metodo de inicio, realización y finalización del juego Piedra, papel y tijera
        /*piedra.iniciar();
        piedra.jugar();
        piedra.finalizar();*/

}
        
}