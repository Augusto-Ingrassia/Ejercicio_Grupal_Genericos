import pila.Pila;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1 Clase Pila:
        Pila<String> pilaTextos = new Pila<>();

        pilaTextos.apilar("Elemento 1");
        pilaTextos.apilar("Elemento 2");
        pilaTextos.apilar("Elemento 3");

        System.out.println("Tamaño de la pila: " + pilaTextos.tamanio());
        System.out.println("Elemento en la cima de la pila: " + pilaTextos.cima());
        System.out.println("Desapilando elemento: " + pilaTextos.desapilar());
        System.out.println("Nueve elemento en la cima de la pila: " + pilaTextos.cima());

        Pila<Integer> pilaNumeros = new Pila<>();

        System.out.println("La pila se encunetra vacia?: " + pilaNumeros.estaVacia());

        pilaNumeros.apilar(50);
        pilaNumeros.apilar(500);

        System.out.println("La pila sigue vacia?: " + pilaNumeros.estaVacia());
        System.out.println("Tamaño de la pila: " + pilaNumeros.tamanio());
        System.out.println("Elemento en la cima de la pila: " + pilaNumeros.cima());
        System.out.println("Desapilando elemento: " + pilaNumeros.desapilar());
        System.out.println("Nueve elemento en la cima de la pila: " + pilaNumeros.cima());
        System.out.println("Desapilando elemento: " + pilaNumeros.desapilar());
        System.out.println("La pila esta vacia nuevamente?: " + pilaNumeros.estaVacia());
        System.out.println("Intentar desapilar una pila vacia: " + pilaNumeros.desapilar());

        //Ejercicio 3 Clase Par:
        Par<String, Integer> par = new Par<>("Edad", 25);

        System.out.println("Par original: " + par);

        Par<Integer, String> invertido = par.invertir();

        System.out.println("Par invertido: " + invertido);
    }
}
