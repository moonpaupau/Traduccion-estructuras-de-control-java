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
public class Ejerciciocuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double nota;
    System.out.println( "Ingrese la nota del estudiante: ");
    nota = sc.nextDouble();
    if (nota>=7)
    {
        System.out.println("Aprobado");
    }
    else{
    System.out.println("Desaprobado");
    }
        // TODO code application logic here
    }
    
}
