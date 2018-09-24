
package clientes;

import listaSimpleLibros.ListaLibros;

public class Cliente {

    String Name;
    int Teléfono;
    String Dirección;
    int Cédula;
    String CorreoElectrónico;
    ListaLibros Libros;

    public ListaLibros getLibros() {
        return Libros;
    }

    public void setLibros(ListaLibros Libros) {
        this.Libros = Libros;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }
    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public int getCédula() {
        return Cédula;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }

    public String getCorreoElectrónico() {
        return CorreoElectrónico;
    }

    public void setCorreoElectrónico(String CorreoElectrónico) {
        this.CorreoElectrónico = CorreoElectrónico;
    }

    public Cliente(int Cédula, String Name, int Teléfono, String Dirección, String CorreoElectrónico, ListaLibros Libros) {
        this.CorreoElectrónico = CorreoElectrónico;
        this.Cédula = Cédula;
        this.Dirección = Dirección;
        this.Name = Name;
        this.Teléfono = Teléfono;
        this.Libros = Libros;
    }

    
    public Cliente(){
        
    }

    @Override
    public String toString() {
        return "clientes{" + "Name=" + Name + ", Tel\u00e9fono=" + Teléfono + ",Cédula=" + Cédula + ",Dirección=" + Dirección + ",Correo Electrónico=" + CorreoElectrónico + "}";
    }
    
}
