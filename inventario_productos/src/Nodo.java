public class Nodo
{
    private String palabra;
    private Nodo siguiente;
    public Nodo(String palabra, Nodo siguiente) {
        super();
        this.palabra = palabra;
        this.siguiente = siguiente;
    }
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
