package Decorador;

import Bebidas.Bebida;

public class Avellana extends Decorador {
    Bebida bebida;

    public Avellana(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Jarabe de Avellana";
    }

    public double costo() {
        return bebida.costo() + 0.8;
    }
}//Avellana

