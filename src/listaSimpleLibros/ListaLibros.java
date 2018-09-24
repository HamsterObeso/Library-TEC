
package listaSimpleLibros;
//Se importa la función libros
import libros.*;

public class ListaLibros{
    //variable a utilizar
    private NodoLibro head;
    
    //gets y sets
    public NodoLibro getHead() {
	return head;
    }
    
    public void setHead(NodoLibro head) {
	this.head = head;
    }

    public ListaLibros(){
        listaVacia();
    }

    private void listaVacia(){
        head = null;
    }
    public boolean esVacia(){
        return head == null;
    }

    public void insertarPrimero(Libro t){
        NodoLibro nuevo = new NodoLibro<>(t);
 
        if (!esVacia()){
            nuevo.setSiguiente(head);
        }
        head=nuevo;
         
    }
    
    public NodoLibro devolverUltimo(){
        NodoLibro elemen = null;
        NodoLibro aux;
        if (!esVacia()){
            aux = head;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemen = aux;
        }
        return elemen;
    }

    public void insertarUltimo(Libro t){
 
        NodoLibro<Libro> nuevo = new NodoLibro<>(t);
        NodoLibro<Libro> aux;
 
        if (esVacia()) {
            insertarPrimero(t);
        }else {
            aux = head;

            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }


    public int largoLista(){
        NodoLibro<Libro> aux;
        int numElementos=0;
        aux = head;
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;
 
    }

    public Libro devolverDato(int pos){
        NodoLibro<Libro> aux=head;
        int cont=0;
        Libro dato=null;
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                cont++; 
            }
        }
        return dato;         
    }
    
    public NodoLibro<Libro> devolverNodo(int pos){
        NodoLibro<Libro> aux=head;
        int cont=0;
         
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    return aux; 
                }
                aux=aux.getSiguiente();
                cont++;
                 
            }
        }
         
        return aux;
         
    }
    public void introducirDato(int pos, Libro dato){
        NodoLibro<Libro> aux=head;
        NodoLibro<Libro> auxDato=null;
        NodoLibro<Libro> anterior=head;
         
        int contador=0;
         
        if(pos<0 || pos>largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
             
            if(pos==0){
                insertarPrimero(dato);
            }else if(pos==largoLista()){
                insertarUltimo(dato);
            }else{
                while(aux!=null){
                    if (pos == contador){
                        
                        auxDato=new NodoLibro<>(dato, aux);
                        
                        anterior.setSiguiente(auxDato);
                    }

                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSiguiente();
                }
            }
        }
         
    }
     
    public void modificarDato(int pos, Libro dato){
        NodoLibro<Libro> aux=head;
        int cont=0;
         
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
  
            while(aux!=null){
                if (pos == cont){
                    
                    aux.setDato(dato); 
                }
                cont++;
                aux=aux.getSiguiente();
            }
        }
         
    }

    public void borraPosicion(int pos){
        NodoLibro<Libro> aux=head;
        NodoLibro<Libro> anterior=null;
        int contador=0;
 
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        head = head.getSiguiente();
                    }else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
    }

    public String mostrarLista(){

        String contenido="";
        NodoLibro<Libro> aux=head;

        while(aux!=null){
            contenido+="["+aux.getDato()+"]";
            aux=aux.getSiguiente();
        }

        return contenido;
    }

    public void show(){
        System.out.print("Inicio>");
        if (!esVacia()) {
            NodoLibro<Libro> current = head;

            do{
                System.out.print("-["+current.getDato()+"]");
                current = current.getSiguiente();
            }while(current != null);

            System.out.println("-null");
        }
    }


}
