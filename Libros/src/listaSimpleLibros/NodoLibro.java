package listaSimpleLibros;
import libros.*;

public class NodoLibro<Libro> {
    
    private Libro dato;
    private NodoLibro<Libro> siguiente;

    public NodoLibro(){
        siguiente=null;
     }
    public NodoLibro(Libro p){
        siguiente=null;
        dato = p;
    }  
    public NodoLibro(Libro t, NodoLibro<Libro> siguiente){
        this.siguiente=siguiente;
        dato = t;
    }     
    
    public Libro getDato() {
        return dato;
    } 
    public void setDato(Libro dato) {
        this.dato = dato;
    }
    
    public NodoLibro<Libro> getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoLibro<Libro> siguiente) {
        this.siguiente = siguiente;
    }     
}