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
public class Ejerciciocinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese la calificacion: ");
        calificacion = sc.nextDouble();
        if (calificacion <= 4.99)
        {
            System.out.println("Definiciente");
        }else{
            if (calificacion <= 6.99)
            {
                System.out.println("Regular");
            }else{
                if (calificacion <= 7.99)
                {
                    System.out.println("Bueno");
                }else{
                    if (calificacion <= 8.99)
                    {
                        System.out.println("Muy bueno");
                    }else{
                        if (calificacion <=10)
                        {
                            System.out.println("Excelente");
                        }
                    }
                }
            }
        }
        // TODO code application logic here
    }
    
}
