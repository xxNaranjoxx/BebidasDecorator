package Decorador;

import Bebidas.Bebida;

public class Azucar extends Decorador {
    Bebida bebida;

    public Azucar(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Azucar";
    }

    public double costo() {
        return bebida.costo() + 0.5;
    }
}//Azucar
