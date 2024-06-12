package Decorador;

import Bebidas.Bebida;

public class LecheAlmendra extends Decorador {
    Bebida bebida;

    public LecheAlmendra(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche de Almendra";
    }

    public double costo() {
        return bebida.costo() + 0.7;
    }
}//LecheAlmendra

