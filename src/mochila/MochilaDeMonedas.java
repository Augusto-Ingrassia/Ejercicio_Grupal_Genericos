package mochila;

import java.util.ArrayList;

public class MochilaDeMonedas {

    private ArrayList<Integer> monedas;

    public MochilaDeMonedas() {
        this.monedas = new ArrayList<>();
    }

    public void guardarMonedas(int cantidad) {
        monedas.add(cantidad);
    }

    public int obtenerMonedas(int indice) {
        if (indice < 0 || indice >= tamanio()) {
            return -1; // Valor centinela por si el índice no existe
        }
        return monedas.get(indice);
    }

    public int tamanio() {
        return monedas.size();
    }
}