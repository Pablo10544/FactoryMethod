package test;

import main.ITransporte;
import main.TransporteFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransporteCarroTest {

    @Test
    void criarCarro(){
        ITransporte transporte= TransporteFactory.obterTransporte("Carro");
        assertEquals("Carro parou na esquina.", transporte.parar());
    }

    @Test
    void obterCarro(){
        ITransporte transporte= TransporteFactory.obterTransporte("Carro");
        assertEquals("Carro atingiu 100 Km/h.", transporte.acelerar());
    }
}
