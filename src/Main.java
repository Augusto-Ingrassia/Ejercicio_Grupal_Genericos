import pila.Pila;
import mochila.Mochila;
import mochila.MochilaDeMonedas;

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
        
        //Ejercicio 2 Clase Mochila:
        Mochila<String> mochilaItems = new Mochila<>();
        
        System.out.println("La mochila de items se encuentra vacia?: " + mochilaItems.estaVacia());
        
        mochilaItems.guardar("Champiñón Rojo");
        mochilaItems.guardar("Flor de Fuego");
        
        System.out.println("La mochila de items sigue vacia?: " + mochilaItems.estaVacia());
        System.out.println("Tamaño de la mochila de items: " + mochilaItems.tamanio());
        System.out.println("Elemento en la posicion 0 de la mochila: " + mochilaItems.obtener(0));
        System.out.println("Elemento en la posicion 1 de la mochila: " + mochilaItems.obtener(1));

        Mochila<Integer> mochilaPuntajes = new Mochila<>();
        mochilaPuntajes.guardar(100);
        mochilaPuntajes.guardar(500);
        System.out.println("Tamaño de la mochila de puntajes: " + mochilaPuntajes.tamanio());
        System.out.println("Puntaje en la posicion 1: " + mochilaPuntajes.obtener(1));

        // Versión específica de monedas
        MochilaDeMonedas mochilaMonedas = new MochilaDeMonedas();
        mochilaMonedas.guardarMonedas(10);
        mochilaMonedas.guardarMonedas(50);
        System.out.println("Tamaño de la mochila especifica de monedas: " + mochilaMonedas.tamanio());
        System.out.println("Monedas en la posicion 0: " + mochilaMonedas.obtenerMonedas(0));

        //Ejercicio 2 Clase Mochila:
        Mochila<String> mochilaItems = new Mochila<>();
        
        System.out.println("La mochila de items se encuentra vacia?: " + mochilaItems.estaVacia());
        
        mochilaItems.guardar("Champiñón Rojo");
        mochilaItems.guardar("Flor de Fuego");
        
        System.out.println("La mochila de items sigue vacia?: " + mochilaItems.estaVacia());
        System.out.println("Tamaño de la mochila de items: " + mochilaItems.tamanio());
        System.out.println("Elemento en la posicion 0 de la mochila: " + mochilaItems.obtener(0));
        System.out.println("Elemento en la posicion 1 de la mochila: " + mochilaItems.obtener(1));

        Mochila<Integer> mochilaPuntajes = new Mochila<>();
        mochilaPuntajes.guardar(100);
        mochilaPuntajes.guardar(500);
        System.out.println("Tamaño de la mochila de puntajes: " + mochilaPuntajes.tamanio());
        System.out.println("Puntaje en la posicion 1: " + mochilaPuntajes.obtener(1));

        // Versión específica de monedas
        MochilaDeMonedas mochilaMonedas = new MochilaDeMonedas();
        mochilaMonedas.guardarMonedas(10);
        mochilaMonedas.guardarMonedas(50);
        System.out.println("Tamaño de la mochila especifica de monedas: " + mochilaMonedas.tamanio());
        System.out.println("Monedas en la posicion 0: " + mochilaMonedas.obtenerMonedas(0));

        //Ejercicio 3 Clase Par:
        Par<String, Integer> par = new Par<>("Edad", 25);

        System.out.println("Par original: " + par);

        Par<Integer, String> invertido = par.invertir();

        System.out.println("Par invertido: " + invertido);
    }
}
