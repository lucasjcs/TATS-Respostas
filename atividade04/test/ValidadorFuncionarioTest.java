import org.junit.*;
import static org.junit.Assert.*;

public class ValidadorFuncionarioTest {

    public ValidadorFuncionarioTest() {
    }
    
    
    //verifica se cargo está vazio ou com valalores errados    
    @Test(expected = IllegalArgumentException.class)
    public void verificaCargoInvalido() {
        Funcionario func = new Funcionario("Lucas", "lucasjcs@live.com", "FRENTISTA", 4000.0);
        validadorFuncionario.validar(func);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void verificaSalarioInvalido() {
        Funcionario func = new Funcionario("Lucas", "lucasjcs@live.com", "", -4000.0);
        validadorFuncionario.validar(func);
    }
    @Test(expected = IllegalArgumentException.class)
    public void verificaNomeVazio() {
        Funcionario func = new Funcionario("", "lucasjcs@live.com", "DESENVOLVEDOR", 4000.0);
        validadorFuncionario.validar(func);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void verificaEmailVazio() {
        Funcionario func = new Funcionario("Lucas", "", "DESENVOLVEDOR", 4000.0);
        validadorFuncionario.validar(func);
    }
    

}
