package pila;

import java.util.ArrayList;

public class Pila<T> {

    private ArrayList<T> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void apilar(T elemento){
        elementos.add(elemento);
    }

    public T desapilar(){
        if (estaVacia()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T cima(){
        if (estaVacia()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia(){
        return elementos.isEmpty();
    }

    public int tamanio(){
        return elementos.size();
    }
    
}
