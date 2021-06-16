/*Crea una clase Fracción con métodos para sumar, restar, multiplicar 
y dividir fracciones.*/

public class Fraccion {

//Se colocan los atributos y se encapsulan porque no interesa
// que otros puedan acceder a estos atributos

    double numero1 = 4.56, numero2 = 9.87;

    public static void main(String[] args) {
        //Creación del objeto
        Fraccion operaciones = new Fraccion();

        //Llamando a los métodos
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();
    }

    //Constructor

    public Fraccion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Fraccion() {
    }

    //Métodos correspondientes

    public void sumar() {

        double suma;

        suma = numero1+numero2;
        System.out.println("La suma de los números en fracción es: "+suma);
    }

    public void restar() {
        double resta;

        resta = numero1 - numero2;
        System.out.println("La resta de los números en fracción es: "+resta);
    }

    public void multiplicar() {
        double multiplicacion;

        multiplicacion = numero1*numero2;
        System.out.println("La multiplicación de los números en fracción es: "+multiplicacion);
    }

    public void dividir() {
        double division;

        division = numero1/numero2;
        System.out.println("La división de las fracciones es: "+division);
    }

     //Creando método setter y getter

     public double getNumero1(){
        return numero1;
    }

    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }

     public double getNumero2(){
        return numero2;
    }

    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
}
