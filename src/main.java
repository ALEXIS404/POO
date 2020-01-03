
import java.util.Scanner;

public class main {
    public static void main (String [] args) {

        Scanner persona= new Scanner(System.in);

        //Introducimos los datos***********
        System.out.println("Introduce el nombre:");
        String nombre = persona.next();
        System.out.println("Introduce la edad:");
        int edad = persona.nextInt();
        System.out.println("Introduce el sexo:");
        char sexo = persona.next().charAt(0);
        System.out.println("Introduce el peso:");
        double peso = persona.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = persona.nextDouble();

        //Creamos cada constructor*********
        Persona persona1 = new Persona();    //por defecto******
        Persona persona2 = new Persona(nombre, edad, sexo);  //con nombre,edad y sexo******
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura); // con todos los atributos como parametro*****

        //Los datos con metodos set*****
        persona1.setNombre("Antonio");
        persona1.setEdad(20);
        persona1.setSexo('H');
        persona1.setPeso(70);
        persona1.setAltura(1.80);

        persona2.setPeso(80.5);
        persona2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}





