package Decorador;

import Bebidas.Bebida;

public class Chocolate extends Decorador {
    Bebida bebida;

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    public double costo() {
        return bebida.costo() + 1.0;
    }
}//Chocolate

