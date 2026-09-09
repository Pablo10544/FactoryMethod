package main;

public class TransporteAviao implements ITransporte{

    @Override
    public String parar() {
        return "Avião parou no aeroporto.";
    }

    @Override
    public String acelerar() {
        return "Avião atingiu 300 Km/h.";
    }
}
