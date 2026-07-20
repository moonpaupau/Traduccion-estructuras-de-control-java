/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;
import java.util.Scanner;

/**
 *
 * @author PAUL LOPEZ
 */
public class Ejercicionueve {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Ingrese el numero a multiplicar: ");
    numero = sc.nextInt();
    for (int i = 1; i <= 12; i++)
    {
        System.out.println("La multiplicacion de" + numero+ "*" + i+ "=" + (numero*i));
    }
}
}
