/*Cree una clase cuadrado. Esta clase cuenta con los métodos de calcular 
área, calcular perimetro. El constructor debe de permitir ingresar el 
tamaño de un lado.*/
import java.util.*;

public class Cuadrado {

    //Se colocan los atributos y se encapsulan porque no interesa
    // que otros puedan acceder a estos atributos

    Scanner leer = new Scanner(System.in);
    private int lado = 0;
    
    public static void main(String[] args) {
        //Creación del objeto
        Cuadrado cuadrado = new Cuadrado();

        //Llamando a los métodos
        cuadrado.ingresarDatos();
        cuadrado.area();
        cuadrado.perimetro();
    }

    //Creación de los constructores
    public Cuadrado(int lado){
        this.lado = lado;
    }

    public Cuadrado(){
        
    }

    //Creación de los métodos correspondientes

    public void ingresarDatos() {
        System.out.println("Ingrese el número que desea saber su área y perímetro: ");
        lado = leer.nextInt();
        leer.nextLine();
    }


    public void area(){
        int areaCuadrado;

        areaCuadrado = lado * lado ;
        System.out.println("El área del cuadrado es: "+areaCuadrado);
    }

    public void perimetro(){
        int permietroCuadrado;

        permietroCuadrado = 4*lado;
        System.out.println("El perímetro del cuadrado es: "+permietroCuadrado);
    }

    //Generaciónde métodos getter and setter

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

}
