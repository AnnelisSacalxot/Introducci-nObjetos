/*Crea una clase Contador con los métodos para incrementar y decrementar
 el contador. La clase contendrá un constructor por defecto, 
 un constructor con parámetros, un constructor copia y los métodos
  getters y setters.*/




public class Contador {

    //Se colocan los atributos y se encapsulan porque no interesa
    // que otros puedan acceder a estos atributos

    private int contador = 0;
    private byte numero = 5;

    public static void main(String[] args) {
        //Creación del objeto
        Contador cont = new Contador();

        //Llamando a los métodos
        cont.incremento();
        cont.decremento();

    }
 
    public Contador(int contador,  byte numero){
        this.contador = contador;
        this.numero = numero;
    }

    public Contador() {
    }


    //Creando los métodos 

    public void incremento() {
        numero++;
        System.out.println("El número incrementado es: "+numero);
    }

    public void decremento() {
        numero--;
        System.out.println("El número decrementado es: "+numero);
    }

    //Creando método setter y getter
    
    public int getContador(){
        return contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(byte numero){
        this.numero = numero;
    }
}
