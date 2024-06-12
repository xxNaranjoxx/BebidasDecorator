package Decorador;

import Bebidas.Bebida;

public class Leche extends Decorador {
    Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        return bebida.costo() + 0.5;
    }
}

