import java.util.Scanner;

import com.packages.operations.*;
import com.packages.arrays.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        String option;
        do {
            System.out.println("Menú de opciones");
            System.out.println("0. Salir");
            System.out.println("1. Operaciones básicas");
            System.out.println("2. Personas");
            System.out.println("3. Vectores");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuOperations();
                    break;
                case "2":
                    menuPersons();
                    break;
                case "3":
                    menuVectors();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuOperations()
    {
        String option;
        long n;
        Operation oper = new Operation();
        do {
            System.out.println("Menú de operaciones");
            System.out.println("0. Regresar");
            System.out.println("1. Suma naturales");
            System.out.println("2. Suma naturales Gauss");
            System.out.println("3. Pares e impares");
            System.out.println("4. Tablas de multiplicar");
            System.out.println("5. Reloj");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println("Suma de 1 a " + n + ": " + oper.sumNaturals(n));
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "2":
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println("Suma de 1 a " + n + ": " + oper.sumNaturalsGauss(n));
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n >= 0) {
                        oper.numberEvenOdd(n);
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "4":
                    System.out.print("Ingrese n: ");
                    n = input.nextLong();
                    if (n > 0) {
                        oper.multiplicationTables(n);
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "5":
                    oper.clock();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }


    public static void menuPersons()
    {
        String option;
        Person per = new Person();
        do {
            System.out.println("Menú Personas");
            System.out.println("0. Regresar");
            System.out.println("1. Grupo más longevo");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    per.oldGroupPerson();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
    
    
    public static void menuVectors()
    {
        String option;
        int datum, position;
        Vector v = new Vector();
        do {
            System.out.println("\nMenú Vectores");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar");
            System.out.println("2. Tamaño");
            System.out.println("3. Mostrar");
            System.out.println("4. Buscar");
            System.out.println("5. Suma");
            System.out.println("6. Promedio");
            System.out.println("7. Máximo");
            System.out.println("8. Mínimo");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    if (v.getN() < v.getT()) {
                        System.out.print("Dato a agregar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        v.addVector(datum);
                    } else {
                        System.out.println("Vector lleno");
                    }
                    break;
                case "2":
                    System.out.println("Tamaño vector: " + v.getN());
                    break;
                case "3":
                    if (v.getN() > 0) {
                        v.showVector();
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "4":
                    if (v.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println("El dato " + datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    if (v.getN() > 0) {
                        System.out.println("Suma del vector: " + v.sumVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "6":
                    if (v.getN() > 0) {
                        System.out.println("Promedio del vector: " + v.avgVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (v.getN() > 0) {
                        System.out.println("Máximo del vector: " + v.maxVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "8":
                    if (v.getN() > 0) {
                        System.out.println("Mínimo del vector: " + v.minVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}