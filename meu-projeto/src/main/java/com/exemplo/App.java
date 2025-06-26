package com.exemplo;

import com.exemplo.model.Soma;

public class App 
{
    public static void main( String[] args )
    {

        Soma s1 = new Soma();

        int a = s1.somar(10,20);
                    
        System.out.println("A soma de ambos os números é: "+ a);
        
    }
}
