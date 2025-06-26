// package com.exemplo;

// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

//import com.exemplo.model.Soma;

package com.exemplo;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


import com.exemplo.model.Soma;
/**
 * Unit test for simple App.
 */
public class SomaTest{

    @BeforeAll 
    static void setup(){
        System.out.println("Inicializando testes...");
    }

    @Test
    @DisplayName("Teste de soma simples")
    void testSoma1() {
        Soma soma = new Soma();
        assertEquals(4, soma.somar(2, 2));
    }

    @Test
    @DisplayName("Teste de soma simples")
    void testSoma2() {
        Soma soma = new Soma();
        assertEquals(33, soma.somar(16, 17));
    }


    @Test
    @DisplayName("Teste de soma simples")
    void testSoma3() {
        Soma soma = new Soma();
        assertEquals(20, soma.somar(10, 10));
    }

    @Test
    @DisplayName("Teste de soma simples")
    void testSoma4() {
        Soma soma = new Soma();
        assertEquals(4, soma.somar(2, 2));
    }




    // @ParameterizedTest
    // @CsvSource({"2, 2, 4", "5, 3, 8"}) 
    // void testSomaParametrizada(int a, int b, int resultado){
    //     assertEquals(resultado, Soma.somar(a,b));
    // }

}
