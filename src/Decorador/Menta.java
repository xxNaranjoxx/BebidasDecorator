package Decorador;

import Bebidas.Bebida;

public class Menta extends Decorador {
    Bebida bebida;

    public Menta(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Menta";
    }

    public double costo() {
        return bebida.costo() + 0.8;
    }
}//Menta

