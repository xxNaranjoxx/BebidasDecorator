package Decorador;

import Bebidas.Bebida;

public class Canela extends Decorador {
    Bebida bebida;

    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Canela";
    }

    public double costo() {
        return bebida.costo() + 0.6;
    }
}//Canela

