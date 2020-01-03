/**
 *
 * @author ALEXIS404
 */

public class Persona {
    //CONSTANTES******
    private final static char SEXO_DEF = 'H';   //Sexo por defecto******
    public static final int INFRAPESO = -1; // El peso de la persona esta por debajo del peso ideal******
    public static final int PESO_IDEAL = 0; // EL PESO DE LA PERSONA ES PERFECTO******
    public static final int SOBREPESO = 1;  //POR ENCIMA DEL PESO IDEAL******

    //ATRIBUTOS*******

    private String nombre;
    private int edad;
    //private String cedula;
    private char sexo;
    private double peso;
    private double altura;

    //CONSTRUCTORES
    /**
     * Constructor por defecto
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
       // this.cedula =();
        this.sexo('H');
        this.peso = 0;
        this.altura = 0;
    }

    private void sexo(char h) {       //NOTA = Esto se creo luego de corregir un error automaticamente*********
    }

    /**
     * Constructor con 3 parametros
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     *******/
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = "";
        this.edad = 0;
        // this.cedula =();
        this.sexo('H');
        this.peso = 0;
        this.altura = 0;
    }

    /**Constructor con todos los parametros como parametro******/
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
    }

    //METODOS PRIVADOS******
    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H*******
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }

    //METODOS PUBLICOS******

    /**Modifica el nombre de la persona******/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Modifica la edad de la persona********/
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**Modifica el sexo de la persona, comprueba que es correcto******/
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**Modifica el peso de la persona*******/
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**Modifica la altura de la persona********/
    public void setAltura(double altura) {
        this.altura = altura;
    }


    //CALCULAR EL INDICE DE MASA CORPORAL******
    public int calcularIMC(){
        final int DebajoPesoIdeal = -1;
        final int PesoIdeal = 0;
        final int SobrePeso = 1;
        double imc = 0;

        if (imc < 20) {
            System.out.println(DebajoPesoIdeal);
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(PesoIdeal);
        } else {
            System.out.println(SobrePeso);
        }
        return DebajoPesoIdeal;
    }
    //INDICA SI ES MAYOR DE EDAD*****
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }


    /**Devuelve informacion del objeto****/

    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else sexo = "mujer";

        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
}




