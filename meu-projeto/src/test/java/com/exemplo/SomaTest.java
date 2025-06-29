package com.exemplo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.exemplo.model.Soma;
/**
 * Unit test for simple App.
 */

public class SomaTest{

    private Soma cal;

    @BeforeEach
    void setup(){
        cal = new Soma();
    }

    @Test
    @DisplayName("Teste de soma simples")
    void somar_dois_numeros_e_conferir_o_resultado(){
        assertEquals(4, cal.somar(2,2));
    }

    @Test
    @DisplayName("Não aparece")
    void teste_somar_erro(){
        assertEquals(6, cal.somar(3,3));
    }

}
