/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1bucles;
import java.util.Scanner;
/**
 *
 * @author Miguel
 */
public class Suma {
    
    private float CantNumber1;
    private float number2;
    private float suma;
    Scanner read = new Scanner(System.in);
    
public Suma (float CantNumber1, float number2, float suma)
{
    this.CantNumber1 = CantNumber1;
    this.number2 = number2;
    this.suma = suma;
}

public Suma ()
{
    this.CantNumber1 = 0;
    this.number2 = 0; 
    this.suma =0;
}

public float getCantNumber1()
{
    return CantNumber1;
} 

public void setCantNumber1(float CantNumber1)
{
    this.CantNumber1 = CantNumber1;
}

public float getNumber2()
{
    return number2;
}

public void setNumber2(float number2)
{
    this.number2 = number2;
}

public float getSuma() 
{
     return suma;
}

public void setSuma(float suma)
{
    this.suma = suma;
}


public float resultSuma()
{
    
    for(int i = 1; i<= this.CantNumber1; i++)
        {
        System.out.println("Ingrese el numero "+i+":");
        this.number2 = read.nextFloat();
        this.suma= this.suma+this.number2;
         
        }
    return suma;
}

}
