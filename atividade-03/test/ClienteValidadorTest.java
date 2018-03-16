import org.junit.*;

public class ClienteValidadorTest {
    
    public ClienteValidadorTest() {
    }
    @Test (expected = IllegalArgumentException.class)
    public void testNomeVazio(){
        Cliente c = new Cliente("", 20, 100.0, 7000);
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSalarioMenorQueZero(){
        Cliente c = new Cliente("Lucao", 20, 100.0, -7000);
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIdadeIncorreta(){
        Cliente c = new Cliente("Lucao", 10, 100.0, 7000);
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testValorDeFinanciamentoIncorreto(){
        Cliente c = new Cliente("Lucao", 20, 90.0, 7000);
        ClienteValidador.Validar(c);
    }
}