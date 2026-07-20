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
public class Ejerciciosiete {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, contador, suma;
        suma = 0;
        contador = 0;
        System.out.println("Ingrese un numero positivo");
        numero = sc.nextInt();
        while (numero>=0)
        {
            suma =  suma + numero;
            contador = contador + 1;
            System.out.println("Ingrese un numero positivo: ");
            numero = sc.nextInt();
        }
        System.out.println("Numeros ingresados: " + contador);
        System.out.println("Suma total de los numeros: " + suma);
    }
    
}
