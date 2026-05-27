package mochila;

import java.util.ArrayList;

public class Mochila<T> {

    private ArrayList<T> elementos;

    public Mochila() {
        this.elementos = new ArrayList<>();
    }

    public void guardar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= tamanio()) {
            return null;
        }
        return elementos.get(indice);
    }

    public int tamanio() {
        return elementos.size();
    }
    
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}