
package arbolbinariotexto;


public class NodoB {
   String dato;
    NodoB Izquierda;
    NodoB Derecha;
 
 public NodoB(String dato){
 this.dato = dato;
 this.Izquierda = null;
 this.Derecha = null;
 } 
 
 public String toString(){
 return "\n El nombre del nodo es: " + dato;
 }
  public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoB getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(NodoB Izquierda) {
        this.Izquierda = Izquierda;
    }

    public NodoB getDerecha() {
        return Derecha;
    }

    public void setDerecha(NodoB Derecha) {
        this.Derecha = Derecha;
    }
    
 }
