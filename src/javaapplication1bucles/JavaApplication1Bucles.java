/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication1Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        Suma n1 = new Suma();
        float CantNumber1;
        float number2;
        
        
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        CantNumber1 = read.nextFloat();
       
        n1.setCantNumber1(CantNumber1);
      
        
        System.out.println("el resultado de la suma es: "+n1.resultSuma());
        
        
    }
    
}
