public class Par<A, B> {

    private A primero;
    private B segundo;


    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

  
    public Par<B, A> invertir() {
        return new Par<>(segundo, primero);
    }


    public A getPrimero() {
        return primero;
    }

    public B getSegundo() {
        return segundo;
    }

    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}