//Programa haciendo uso del metodo main para ejecutar el print "Hello, World!" en el Terminal

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println((double) 2 * 4/6);

        boolean mayorDeEdad = true;
        boolean tieneCarnet = false;
            System.out.println(mayorDeEdad && tieneCarnet);
            System.out.println(mayorDeEdad || tieneCarnet);
            System.out.println(!mayorDeEdad);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        
        System.out.print("Ingrese una base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese una altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("La base calculada es: " + area);

        System.out.println("Promedio para notas de estudiante, siga las instrucciones:");

        System.out.print("Ingrese la primera nota: ");
        double primeraNota = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double segundaNota = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double terceraNota = sc.nextDouble();

        double promedioNotas = (primeraNota + segundaNota + terceraNota)/3;
        System.out.println("El promedio del estudiante es igual a:" + promedioNotas);
*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        int nota = sc.nextInt();
        if (nota >= 90) {
            System.out.println("Excelente nota!");
        } else if (nota >= 70) {
            System.out.println("Buena nota");
        } else if (nota >= 60) {
            System.out.println("Rozando");
        } else {
            System.out.println("Cagaste mano :(");
        }

        sc.close();
    }
}
