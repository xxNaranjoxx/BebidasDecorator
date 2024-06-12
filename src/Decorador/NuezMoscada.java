package Decorador;

import Bebidas.Bebida;

public class NuezMoscada extends Decorador {
    Bebida bebida;

    public NuezMoscada(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Nuez Moscada";
    }

    public double costo() {
        return bebida.costo() + 0.5;
    }
}//NuezMoscada

