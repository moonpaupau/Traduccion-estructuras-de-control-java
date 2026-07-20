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
public class Ejercicioocho {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String contraseña;
        do{
            System.out.println("Ingrese la contraseña");
            contraseña = sc.next();
        }
        while (!contraseña.equals("java2026"));
        System.out.println("Acceso concedido");
    }
    
}
