/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author CherryLady
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Solicitar un número por pantalla de 5 cifras y decir si es capicua.
        
        //Definir variables
        int num;
        int dm, um, c, d, u;
        Scanner A = new Scanner(System.in);
        
        //Recibir información de consola (Solicitar el número)
        System.out.print("Escriba un número de 5 dígitos --> ");
        num = A.nextInt();
        
        //Obtener las unidades
        u = num % 10;
        num =num / 10;
        
        //Obtener las decenas
        d = num % 10;
        num =num / 10;
        
        //Obtener las centenas
        c = num%10;
        num = num /10;
        
        //obtener las unidades de millar
        um= num%10;
        num = num /10;
        
        //decenas de millar
        dm = num;
        
        if (u == dm && d == um) {
            System.out.println("El número es capicúa");
        }
        else {
            System.out.println("El número no es capicúa");
        } 
    }
    
}
