package Decorador;

import Bebidas.Bebida;

public class Crema extends Decorador{
    Bebida bebida;

    public Crema(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    public double costo() {
        return bebida.costo() + 0.8;
    }

}//Crema
