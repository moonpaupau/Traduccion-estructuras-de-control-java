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
public class Ejerciciodiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma;
        double promedio;
        suma = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            suma = suma + numero;
        // TODO code application logic here
        }   
        promedio = suma / 10; 
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
 }       
}
