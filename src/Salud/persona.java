//Reto 1
package Salud;
import java.util.*;

public class persona {
//Crear atributos
private String tipoDoc;
private int documento;
private String nombre;
private String apellido;
private double peso;
private double estatura;
private int edad;
private String sexo;
private double pesoActual; 
//getters y setters
public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public double getPesoActual() {
    return pesoActual;
}

public void setPesoActual(double pesoActual) {
    this.pesoActual = pesoActual;
}
  
//metodo constructor sin parametros
public persona(){
    
}

//Metodo construcctor con parametros
/* public persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad,
        String sexo) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
}*/


/*public persona(){
}*/
 


//Creando el metodo para solicitar los datos
public void solicitarDatos(){
    Scanner Lectura = new Scanner(System.in);
    System.out.println("digíte su tipo de documento");
    tipoDoc = Lectura.next();
    System.out.println("digite su número de documento");
    documento = Lectura.nextInt();
    System.out.println("digíte su nombre ");
    nombre = Lectura.next();
    System.out.println("digite su apellido");
    apellido = Lectura.next();
    System.out.println("digite su peso");
    peso = Lectura.nextDouble();
    System.out.println("digite su estatura");
    estatura = Lectura.nextDouble();
    System.out.println("digite su edad");
    edad = Lectura.nextInt();
    System.out.println("digite su sexo");
    sexo = Lectura.next();
    Lectura.close();
}
    //Crear el metodo para mostrar los datos ingresados
public void mostrarDatos(){
    System.out.println("documento: " + tipoDoc);
    System.out.println("número documento:" + documento);
    System.out.println("su nombre es:" + nombre);
    System.out.println("su apellido es: " + apellido);
    System.out.println("su peso es:" + peso);
    System.out.println("su estatura es:" + estatura);
    System.out.println("su edad es:" + edad);
    System.out.println("su sexo es:" + sexo);
}
    //Calcular IMC sin retorno
public void calcularImc(){
    pesoActual = peso / (estatura * estatura);
    if (pesoActual < 20 ) {
        System.out.println("el peso esta por debajo de lo ideal");
    }else if (pesoActual > 20 && pesoActual <= 25) {
        System.out.println("el peso es ideal");
    }else{
        System.out.println("Tiene sobrepeso");
    }
}
    //Imprimir si es mayor de edad
public void mayorEdad(){
    if(edad > 17){
        System.out.println("usted es mayor de edad");
    }else{
        System.out.println("usted es menor de edad");
    }
}
//Reto 2
    //Crear el metodo con retorno pesoActual
public String calcularImc2(double peso, double estatura){
    pesoActual = peso / (estatura * estatura);
    if (pesoActual < 20) {
        return "peso bajo";
    }else if (pesoActual > 20 && pesoActual <= 25) {
        return "peso bajo";
}else{
        return "sobre peso";
    }
}


 





}
