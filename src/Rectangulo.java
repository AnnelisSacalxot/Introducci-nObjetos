/*Cree una clase rectángulo. Esta clase cuenta con los métodos 
de calcular área, calcular perímetro. El constructor debe de
 permitir ingresar ancho y el largo. Debe verificar que
 no sean iguales.*/
  import java.util.*;

public class Rectangulo {
    
     //Se colocan los atributos y se encapsulan porque no interesa
    // que otros puedan acceder a estos atributos

    private int ancho = 0;
    private int largo = 0;
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Creación del objeto
        Rectangulo rectangulo = new Rectangulo();

        //Llamando a los métodos
        rectangulo.ingresarDatos();
        rectangulo.comparacionDato();
        //rectangulo.areaRectangulo();
        //rectangulo.perimetroRectangulo();

    }

    public Rectangulo(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo(){
        
    }

     //Creación de los métodos correspondientes
    public void ingresarDatos() {
        System.out.println("Ingrese los valores para saber el área y perímetro del rectángulo");
        System.out.println("Ingrese el ancho: ");
        ancho = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el largo: ");
        largo = leer.nextInt();
        leer.nextLine();
    }

    public void comparacionDato(){
        
        if (ancho == largo) {
            System.out.println("Los número son iguales, ingrese números distintos");
        } else {
            if (ancho != largo) {
                areaRectangulo();
                perimetroRectangulo();
            }
        }
    }

    public void areaRectangulo(){
        int areaRectangulo;

        areaRectangulo = ancho*largo ;
        System.out.println("El área del rectángulo es: "+areaRectangulo);
    }

    public void perimetroRectangulo(){
        int permietroRectangulo;

        permietroRectangulo =  2*ancho + 2*largo;
        System.out.println("El perímetro del rectángulo es: "+permietroRectangulo);
    }

 //Creando método setter y getter

    public int getAncho(){
        return ancho;
    }

    public void setAncho(int ancho){
        this.ancho = ancho;
    }

    public double getLargo(){
        return largo;
    }

    public void setLargo(int largo){
        this.largo = largo;
    }


}
