package Decorador;

import Bebidas.Bebida;

public class Frambuesa extends Decorador {
    Bebida bebida;

    public Frambuesa(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Jarabe de Frambuesa";
    }

    public double costo() {
        return bebida.costo() + 0.9;
    }
}//Frambuesa

