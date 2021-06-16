public class Persona {

    //Se colocan los atributos y se encapsulan porque no interesa
    // que otros puedan acceder a estos atributos

    private String nombre;
    private byte edad;
    private byte dni;
    private char sexo;
    private short peso;
    private short altura;

    public static void main(String[] args) throws Exception {
        //Creación del objeto
        Persona persona = new Persona();

        //Llamando a los métodos
        persona.calcularIMC();
        persona.mayorEdad();
        persona.comprobarSexo();
        persona.generaDNI();


    }

    //Se inicializa el constructor con todos los atributos de la clase
    public Persona(){
     this.nombre = nombre;  
     this.edad = edad;
     this.dni = dni;
     this.sexo = sexo;
     this.peso = peso;
     this.altura = altura;
    }

    //Creación de métodos

    public void calcularIMC(){

    }

    public void mayorEdad(){

    }

    public void comprobarSexo(){

    }

    public void generaDNI(){

    }

    //se creara el metodo toString
    public String toString(){
        return "Nombre"+nombre;
    }
}
