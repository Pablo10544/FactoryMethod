package test;

import main.ITransporte;
import main.TransporteFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransporteMotoTest {
    @Test
    void pararMoto(){
        ITransporte transporte= TransporteFactory.obterTransporte("Moto");
        assertEquals("Moto parou na esquina.", transporte.parar());
    }

    @Test
    void acelerarMoto(){
        ITransporte transporte= TransporteFactory.obterTransporte("Moto");
        assertEquals("Moto atingiu 70 Km/h.", transporte.acelerar());
    }
}
