package main;

public class TransporteCarro implements ITransporte{
    @Override
    public String parar() {
        return "Carro parou na esquina.";
    }

    @Override
    public String acelerar() {
        return "Carro atingiu 100 Km/h.";
    }
}
