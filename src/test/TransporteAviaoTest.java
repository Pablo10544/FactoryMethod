package test;

import main.ITransporte;
import main.TransporteFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransporteAviaoTest {

    @Test
    void pararAviao(){
        ITransporte transporte= TransporteFactory.obterTransporte("Aviao");
        assertEquals("Avião parou no aeroporto.", transporte.parar());
    }

    @Test
    void acelerarAviao(){
        ITransporte transporte= TransporteFactory.obterTransporte("Aviao");
        assertEquals("Avião atingiu 300 Km/h.", transporte.acelerar());
    }
}

