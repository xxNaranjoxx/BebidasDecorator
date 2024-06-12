package Decorador;

import Bebidas.Bebida;

public class Vainilla extends Decorador {
    Bebida bebida;

    public Vainilla(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Vainilla";
    }

    public double costo() {
        return bebida.costo() + 0.7;
    }
}//Vainilla

