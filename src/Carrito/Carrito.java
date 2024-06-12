package Carrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<String> elementos;

    public Carrito() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public void quitarElemento(String elemento) {
        elementos.remove(elemento);
    }

    public List<String> getElementos() {
        return elementos;
    }

    public double calcularTotal() {
        // Implementa la lógica para calcular el total del carrito
        return 0.0;
    }

    // Otros métodos según sea necesario
}

