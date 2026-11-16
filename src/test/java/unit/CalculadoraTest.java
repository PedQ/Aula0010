package unit;


import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testarSoma() {
        assertEquals(13, calculadora.somar(5, 8));
    }

    @Test
    void testarSubtracao() {
        assertEquals(5, calculadora.subtrair(10, 5));
    }

    @Test
    void testarMultiplicacao() {
        assertEquals(25, calculadora.multiplicar(5, 5));
    }

    @Test
    void testarDivisao() {
        assertEquals(2, calculadora.dividir(10, 5));
    }

    @Test
    void testarDivisaoPorZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );
    }
}
