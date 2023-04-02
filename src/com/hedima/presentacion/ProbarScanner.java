package com.hedima.presentacion;
import java.util.Scanner;

public class ProbarScanner {

    public static void main(String[] args) {
        //Declar una variable primitiva
        int numero = 10;
        //Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero->");
        numero = sc.nextInt();
        System.out.println("El numero es: " + numero);

        //Solicitar un nombre, si el nombre es "Juan" le damos la bienvenida, si no solo damos la bienvenida.
        String nombre = ("Juan");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre->");
        nombre= sc.next();
        if (nombre.equals("Juan")) {
            System.out.println("Te damos la bienvenida :" + nombre );
        } else {
            System.out.println();
            //Solicitar  un nombre, si el nombre es  "Juan" le damos la bienvenida, si no sólo damos la bienvenida.
            System.out.println("Ingrese un nombre->");
            String nombre = sc.next();
            if (nombre.equalsIgnoreCase("Juan")) {
                System.out.println("Bienvenido " + nombre);
            }
                //Pedir dos números y decir si son iguales o no.
            //    System.out.println("Ingrese dos numeros->");
            //    int num1 = sc.nextInt();
            //    int num2 = sc.nextInt();
            //    if (num1 == num2) {
            //        System.out.println("Los numeros son iguales");
            //    } else {
                    System.out.println("Los numeros no son iguales");
                   // Pedir dos números y decir cual es el mayor de los dos.
                    System.out.println("Numero 1:");
                    int n1 = sc.nextInt();
                    System.out.println( "Numero 2");
                    int n2= sc.nextInt();
                    if (n1 > n2) {
                        System.out.println(n1 + " es mayor");
                    } else {
                        System.out.println(n2 + " es mayor");
                        // Pedir dos numeros y mostrarlos ordenados de mayor a menor.
                        System.out.println("Ingrese dos numeros->");
                        int num3 = sc.nextInt();
                        int num4 = sc.nextInt();
                        if (num3 > num4) {
                            System.out.println(num3 + " ," + num4);

                        } else if (num3 < num4) {
                            System.out.println(num4 + " ," + num3);








                        }




                }


    }

}
