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

        //Operador ternario

        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);

        //Switch

        System.out.print("Ingrese un dia: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No valido");
                break;
        }

        

        System.out.print("Numero 1: ");
        double numeroUno = sc.nextDouble();

        System.out.print("\nIngrese un numero para realizar una de las siguientes opreaciones: \n 1: Suma\n 2: Resta\n 3: Multiplicación\n 4: División\n\n  :");
        int ope = sc.nextInt();

        System.out.print("\nNumero 2: ");
        double numeroDos = sc.nextDouble();

        double resultado;

        switch (ope) {
            case 1:
                resultado = numeroUno + numeroDos;
                System.out.println(resultado);
                break;
            case 2:
                resultado = numeroUno - numeroDos;
                System.out.println(resultado);
                break;
            case 3:
                resultado = numeroUno * numeroDos;
                System.out.println(resultado);
                break;
            case 4:
                if (numeroDos == 0) {
                    System.out.println("No se puede dividir entre cero");
                }
                else { 
                    resultado = numeroUno / numeroDos;
                    System.out.println(resultado);
                }
                break;
            default:
                System.out.println("Operación no valida");
                break;

        }

        

        //FOR

        for (int i = 0; i <=15; i++) {
            if (i % 2 == 0) {
                System.out.println("Iteración "+ i);
            }
        }

        // Tabla de multiplicar
        
        Scanner sc = new Scanner(System.in);

        int edad = -1;

        while (edad < 0 || edad > 120) {
            System.out.print("Ingrese su edad ( 0 - 120 ): ");
            edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                System.out.println("Edad invalida, intente de nuevo.");
            }
        }
        System.out.println("Edad registrada: " + edad);

        // While es un ciclo condicionado a el inicio, mientras que el do while es condicionado al final

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n\n\n===MENÚ===");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Fracasar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("\n\n\nHola putos");
                break;
            case 2:
                System.out.println("\n\n\nChao putos");
                break;
            case 3:
                System.out.println("\n\n\nEres el desperdicio de masa mas grande en el espacio entero");
                break;
            default:
                System.out.println("\n\n\nAprenda a seguir instrucciones");
                break;
            } 
        
        } while (opcion != 0);

        System.out.println("\n\n\nPrograma finisheado.");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        System.out.println("\n\n\n");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);

        int[] notas = new int [5];

        notas [0] = 85;
        notas [1] = 90;
        notas [2] = 78;
        notas [3] = 92;
        notas [4] = 88;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);   
        }

        for (int nota : notas) {
            System.out.println(nota);
        }

        */

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes hay? ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0;i < n; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / n;
        System.out.println("Promedio de grupo: " + promedio);
        
        sc.close();

    }

}
