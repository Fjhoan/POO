package Salud;

public class empleado extends persona{

    //Crear atributos
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    private double valor;
    private double total;

    public empleado(String cargo, double valorHora,double horasTrabajadas, String departamento){
        super();
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public double calcularHonorarios(double valorhora, double horasTrabajadas){
        System.out.println("calcular honorarios");
        total = valorHora * horasTrabajadas;
        valor = total * 0.0966;
        valor = total - valor;
        return valor;
    }
    public void mostrarDatosEmpleado(){
        System.out.println("documento: " + getTipoDoc());
        System.out.println("número documento:" + getDocumento());
        System.out.println("su nombre es:" + getNombre());
        System.out.println("su apellido es: " + getApellido());
        System.out.println("su peso es:" + getPeso());
        System.out.println("su estatura es:" + getEstatura());
        System.out.println("su edad es:" + getEdad());
        System.out.println("su sexo es:" + getSexo());
        System.out.println("su cargo es: " + cargo);
        System.out.println("el valor de la hora es: " + valorHora);
        System.out.println("usted a trabajado: " + horasTrabajadas + " horas extras");
        System.out.println("su departamento es: " + departamento);
    }
    
}


