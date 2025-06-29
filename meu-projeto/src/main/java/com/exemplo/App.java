package com.exemplo;

import com.exemplo.model.Soma;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        Soma s1 = new Soma();

        System.out.println("Enter a number: ");
        int value = input.nextInt();

        System.out.println("Enter other number: ");
        int value2 = input.nextInt();

        int a = s1.somar(value,value2);
             
        System.out.println("A soma de ambos os números é: "+ a);

        for (int i = 0; i  < 3; i++){
            System.out.println(" -- Rodou meu prorama -- ");
        }
        
    }
}
