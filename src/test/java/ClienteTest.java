import org.example.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        this.cliente = new Cliente();
    }

    @Test
    void clienteElegivel() {
        Assertions.assertTrue(cliente.isElegivel(20, 700));
    }

    @Test
    void clienteNaoElegivelPorIdade() {
        Assertions.assertFalse(cliente.isElegivel(17, 700));
    }

    @Test
    void clienteNaoElegivelPorPontosSerasa() {
        Assertions.assertFalse(cliente.isElegivel(29, 500));
    }
}
