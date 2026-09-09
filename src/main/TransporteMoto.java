package main;

public class TransporteMoto implements ITransporte {
    @Override
    public String parar() {
        return "Moto parou na esquina.";
    }

    @Override
    public String acelerar() {
        return "Moto atingiu 70 Km/h.";
    }
}
