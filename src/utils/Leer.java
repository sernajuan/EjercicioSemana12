/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;


public class Leer {
      public static Scanner teclado = new Scanner(System.in);
   
    public static String cadena(){
        //nextLine() -->Leer cadena
        return teclado.nextLine();
    }
    public static int entero(){
        return Integer.valueOf(cadena());
    }
    
    public static double decimal(){
        return Double.valueOf(cadena());
    }
    public static char Letra(){
        return cadena().charAt(0);
    }
    public static void main(String[] args){
        
    }
    
}
