package test;

import main.ITransporte;
import main.TransporteFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TransporteFactoryTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            ITransporte transporte = TransporteFactory.obterTransporte("CarroVoador");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            ITransporte transporte = TransporteFactory.obterTransporte("Jetski");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inválido", e.getMessage());
        }
    }
}
