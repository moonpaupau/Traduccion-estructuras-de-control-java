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
public class Ejercicioonce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa el numero 1: ");
        numero = sc.nextInt();
        int mayor = numero;
        int menor = numero;
        for (int i = 2; i <= 10; i++){
            System.out.println("Ingrese el numero: " + i + ":");
            numero = sc.nextInt();
            if (numero > mayor){
                mayor = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }    
        System.out.println("El numero mayor es:" + mayor);
        System.out.println("El numero menor es:" + menor);            
        // TODO code application logic here
    }    
}
