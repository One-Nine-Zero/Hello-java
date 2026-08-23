//Programa haciendo uso del metodo main para ejecutar el print "Hello, World!" en el Terminal

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        
        System.out.println((double) 2 * 4/6); //Practica System.out.println y tipo de dato boolean

        boolean mayorDeEdad = true;
        boolean tieneCarnet = false;
            System.out.println(mayorDeEdad && tieneCarnet);
            System.out.println(mayorDeEdad || tieneCarnet);
            System.out.println(!mayorDeEdad);
        
        Scanner sc = new Scanner(System.in);

        //Datos de usuario

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        //Area de un rectangulo
        
        System.out.print("Ingrese una base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese una altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("La base calculada es: " + area); 

        */

        
    
        Scanner sc = new Scanner(System.in);

        //Area de un ciruclo

        System.out.println("Calculo de area de un circulo, siga las instrucciones:\n");
        
        System.out.print("  Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        double pi = 3.14159265359;
        double areaCirculo = pi*(radio*radio);
        System.out.println("\nEl area del circulo es igual a: " + areaCirculo + "\n");

        //Area de un cuadrado

        System.out.println("\nCalculo de area de un cuadrado, siga las instrucciones:\n");
        
        System.out.print("  Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();

        double areaCuadrado = lado*lado;
        System.out.println("\nEl area del cuadrado es igual a: " + areaCuadrado + "\n");

        //Clasificación de edad

        System.out.println("\nClasificación de edad, siga las instrucciones: \n");

        System.out.print("  Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >=60 ) {
            System.out.println("    El usuario es un adulto mayor");
        } else if (edad >= 18) {
            System.out.println("    El usuario es un adulto");
        } else {
            System.out.println("    El usuario es un menor de edad");
        }

        //Promedio notas

        System.out.println("\nPromedio para notas de estudiante, siga las instrucciones:\n");

        System.out.print("  Ingrese la primera nota: ");
        double primeraNota = sc.nextDouble();

        System.out.print("  Ingrese la segunda nota: ");
        double segundaNota = sc.nextDouble();

        System.out.print("  Ingrese la tercera nota: ");
        double terceraNota = sc.nextDouble();

        double promedioNotas = (primeraNota + segundaNota + terceraNota)/3;
        System.out.println("\nEl promedio del estudiante es igual a: " + promedioNotas + "\n");

        //Clasificación de promedios

        if (promedioNotas >= 90) {
            System.out.println("    Excelente nota!");
        } else if (promedioNotas >= 70) {
            System.out.println("    Buena nota");
        } else if (promedioNotas >= 60) {
            System.out.println("    Rozando");
        } else {
            System.out.println("    Cagaste mano :(");
        }

        sc.close();

    }

}
