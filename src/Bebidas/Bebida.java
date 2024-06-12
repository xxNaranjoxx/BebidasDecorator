package Bebidas;
public abstract class Bebida {
    protected String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();

}//Bebida
