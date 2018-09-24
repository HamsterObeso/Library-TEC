package atencionClientes;
import clientes.*;
public class ListaClientes{
    private atencionClientes.NodoCliente<Cliente> head;
    
    public atencionClientes.NodoCliente<Cliente> getHead() {
	return head;
    }
    
    public void setHead(atencionClientes.NodoCliente<Cliente> head) {
	this.head = head;
    }

	

    public ListaClientes(){
        listaVacia();
    }

    private void listaVacia(){
        head = null;
    }
    public boolean esVacia(){
        return head == null;
    }

    public void insertarPrimero(Cliente t){
        atencionClientes.NodoCliente<Cliente> nuevo = new atencionClientes.NodoCliente<>(t);
 
        if (!esVacia()){
            nuevo.setSiguiente(head);
        }
        head=nuevo;
         
    }
    
    public atencionClientes.NodoCliente<Cliente> devolverUltimo(){
        atencionClientes.NodoCliente<Cliente> elemen = null;
        atencionClientes.NodoCliente<Cliente> aux;
        if (!esVacia()){
            aux = head;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemen = aux;
        }
        return elemen;
    }

    public void insertarUltimo(Cliente t){
 
        atencionClientes.NodoCliente<Cliente> nuevo = new atencionClientes.NodoCliente<>(t);
        atencionClientes.NodoCliente<Cliente> aux;
 
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
        atencionClientes.NodoCliente<Cliente> aux;
        int numElementos=0;
        aux = head;
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;
 
    }

    public Cliente devolverDato(int pos){
        atencionClientes.NodoCliente<Cliente> aux=head;
        int cont=0;
        Cliente dato=null;
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
    
    public atencionClientes.NodoCliente<Cliente> devolverNodo(int pos){
        atencionClientes.NodoCliente<Cliente> aux=head;
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
    public void introducirDato(int pos, Cliente dato){
        atencionClientes.NodoCliente<Cliente> aux=head;
        atencionClientes.NodoCliente<Cliente> auxDato=null;
        atencionClientes.NodoCliente<Cliente> anterior=head;
         
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
                        
                        auxDato=new atencionClientes.NodoCliente<>(dato, aux);
                        
                        anterior.setSiguiente(auxDato);
                    }

                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSiguiente();
                }
            }
        }
         
    }
     
    public void modificarDato(int pos, Cliente dato){
        atencionClientes.NodoCliente<Cliente> aux=head;
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
        atencionClientes.NodoCliente<Cliente> aux=head;
        atencionClientes.NodoCliente<Cliente> anterior=null;
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
        atencionClientes.NodoCliente<Cliente> aux=head;

        while(aux!=null){
            contenido+="["+aux.getDato()+"]";
            aux=aux.getSiguiente();
        }

        return contenido;
    }

    public void show(){
        System.out.print("Inicio>");
        if (!esVacia()) {
            atencionClientes.NodoCliente<Cliente> current = head;

            do{
                System.out.print("-["+current.getDato()+"]");
                current = current.getSiguiente();
            }while(current != null);

            System.out.println("-null");
        }
    }


}
