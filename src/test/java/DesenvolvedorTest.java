import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    void deveArmazenarBranches() {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setBranch(EstadoBranchDev.getInstance());
        desenvolvedor.setBranch(EstadoBranchHomog.getInstance());
        assertEquals(2, desenvolvedor.getBranches().size());
    }

    @Test
    void deveRetornarBranchInicial() {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setBranch(EstadoBranchProd.getInstance());
        desenvolvedor.setBranch(EstadoBranchHomog.getInstance());
        desenvolvedor.restoreBranch(0);
        assertEquals(EstadoBranchProd.getInstance(), desenvolvedor.getBranch());
    }

    @Test
    void deveRetornarBranchAnterior() {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setBranch(EstadoBranchDev.getInstance());
        desenvolvedor.setBranch(EstadoBranchHomog.getInstance());
        desenvolvedor.setBranch(EstadoBranchProd.getInstance());
        desenvolvedor.restoreBranch(1);
        assertEquals(EstadoBranchHomog.getInstance(), desenvolvedor.getBranch());
    }

    @Test
    void deveRetornarExcecaoBranchInvalida() {
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor();
            desenvolvedor.restoreBranch(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Branch not found", e.getMessage());
        }
    }
}