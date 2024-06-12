package Decorador;

import Bebidas.Bebida;

public class Caramelo extends Decorador {
    Bebida bebida;

    public Caramelo(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Caramelo";
    }

    public double costo() {
        return bebida.costo() + 0.9;
    }
}

