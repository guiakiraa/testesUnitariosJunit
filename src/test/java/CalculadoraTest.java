import org.example.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private  Calculadora calc;

    @BeforeEach
    void setup() {
        this.calc = new Calculadora();
    }

    @Test
    void somarDoisNumeros() {
        assertEquals(10, calc.soma(5, 5));
    }

    @Test
    void subtrairDoisNumeros() {
        assertEquals(5, calc.subtrair(15, 10));
    }

    @Test
    void dividirDoisNumeros() {
        assertEquals(3, calc.dividr(15, 5));
    }

    @Test
    void multiplicarDoisNumeros() {
        assertEquals(30, calc.multiplicar(5, 6));
    }
}
