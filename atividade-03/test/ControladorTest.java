import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class ControladorTest {
    
    public ControladorTest() {
    }

    @Test
    public void testDadosUsuario() {
        Cliente cli = new Cliente("Lucas", 20, 200.0, 1500.0);
        Controlador c = new Controlador();
        List<Proposta> propostas = c.processar(cli);
        assertEquals(3, propostas.size());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDadosUsuarioInvalido() {
        Cliente cli = new Cliente("", 20, 200.0, 1500.0);
        Controlador c = new Controlador();
        c.processar(cli);
    }
}