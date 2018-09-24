/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionClientes;


public class NodoCliente<clientes> {
    //Se establecen las variables
    private clientes dato;
    private NodoCliente<clientes> siguiente;
    
    //función encargada de los nodos de la lista de clientes
    public NodoCliente(){
        siguiente=null;
     }
    public NodoCliente(clientes p){
        siguiente=null;
        dato = p;
    }  
    public NodoCliente(clientes t, NodoCliente<clientes> siguiente){
        this.siguiente=siguiente;
        dato = t;
    }     
    
    public clientes getDato() {
        return dato;
    } 
    public void setDato(clientes dato) {
        this.dato = dato;
    }
    
    public NodoCliente<clientes> getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoCliente<clientes> siguiente) {
        this.siguiente = siguiente;
    }     
}

