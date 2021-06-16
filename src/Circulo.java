/*Cree una clase circulo. Esta clase debe tener métodos como calcular 
el área y el perimetro.*/

public class Circulo {

    //Se colocan los atributos y se encapsulan porque no interesa
    // que otros puedan acceder a estos atributos

    private double pi = 3.1416;
    private double radio = 9.0;
    public static void main(String[] args) {
        //Creación del objeto
        Circulo circulo = new Circulo();

        //Llamando a los métodos
        circulo.areaCirculo();
        circulo.perimetroCirculo();
    }

    public Circulo(double pi, double radio){
        this.pi = pi;
        this.radio = radio;
    }

    public Circulo(){
        
    }

    //Creación de los métodos correspondientes

    public void areaCirculo(){
     
        double area;

        area = pi*(radio*radio);
        System.out.println("El área del circulo es: "+area);
    }

    public void perimetroCirculo(){
     
        double perimetro;

        perimetro = 2*pi*radio;
        System.out.println("El perímetro del circulo es: "+perimetro);
    }

    //Creando método setter y getter

    public double getPi(){
        return pi;
    }

    public void setPi(double pi){
        this.pi = pi;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
    
}
