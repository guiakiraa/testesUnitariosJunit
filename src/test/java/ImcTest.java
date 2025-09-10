import org.example.Imc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImcTest {

    @Test
    void calcularImc() {
        assertEquals(20, Imc.calcularImc(57.8, 1.70));
    }
}
