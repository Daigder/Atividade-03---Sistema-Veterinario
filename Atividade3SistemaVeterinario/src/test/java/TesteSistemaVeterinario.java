import org.example.SistemaVeterinario;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSistemaVeterinario {

    @Test
    public void testCadastrarAnimal() {
        SistemaVeterinario sistema = new SistemaVeterinario();
        assertTrue(sistema.cadastrarAnimal("Nasus", "Cachorro", 4, "Anna Vezozzo"));
    }

    @Test
    public void testBuscarAnimalPorId() {
        SistemaVeterinario sistema = new SistemaVeterinario();
        sistema.cadastrarAnimal("Nasus", "Cachorro", 4, "Anna Vezozzo");
        assertNotNull(sistema.buscarAnimalPorId(1));
    }

    @Test
    public void testAlterarAnimal() {
        SistemaVeterinario sistema = new SistemaVeterinario();
        sistema.cadastrarAnimal("Nasus", "Cachorro", 4, "Alice");
        assertTrue(sistema.alterarAnimal(1, "Bobby", "Cachorro", 5, "Anna Vezozzo"));
    }

    @Test
    public void testExcluirAnimal() {
        SistemaVeterinario sistema = new SistemaVeterinario();
        sistema.cadastrarAnimal("Nasus", "Cachorro", 4, "Anna Vezozzo");
        assertTrue(sistema.excluirAnimal(1));
    }

    @Test
    public void testListarAnimais() {
        SistemaVeterinario sistema = new SistemaVeterinario();
        sistema.listarAnimais();
    }
}

