
package arbolbinariotexto;


public class ArbolBinario {
    NodoB root; //crea el nodo raiz del árbol
    
  public ArbolBinario(){
      root = null; // inicializa el nodo creado como nulo
  }
  
  //método para insertar un nodo en el árbol
  public boolean arbvacio(){
      return root == null;
  }
  
  //método para insertar un nodo en el árbol
  public void agregaNodo(String valor){
      NodoB nuevo = new NodoB(valor);
      if (root==null){
          root = nuevo;
      }else{
          NodoB aux = root;
          NodoB da;
          while(true){
              da = aux;
              if(valor.compareTo(aux.dato)<=0){
                  aux = aux.Izquierda;
                  if(aux == null){
                      da.Izquierda = nuevo;
                      return;
                  }
              }else{
                  aux = aux.Derecha;
                  if(aux == null){
                      da.Derecha = nuevo;
                      return;
                  }
              }
          }
      }
  }
  
  //metodo para recorrer árbol INORDEN
   public void printPreOrder(){
        preOrder(root);//llama al metodo recursivo pre order
    }
    
    private void preOrder(NodoB actual){
        if(actual != null){
            System.out.print("[" + actual.getDato() + "]");//visit node
            preOrder(actual.getIzquierda()); //travers left side
            preOrder(actual.getDerecha()); //travers right site
        }
    }
    
     public void printPostOrder(){
        postOrder(root);//llama al metodo recursivo pre order
    }
    
    private void postOrder(NodoB actual){
        if(actual != null){
            postOrder(actual.getIzquierda()); //travers left side
            postOrder(actual.getDerecha()); //travers right site
            System.out.print("[" + actual.getDato() + "]");//visit node
        }
    }
      public void printInOrder(){
        inOrder(root);//llama al metodo recursivo pre order
    }
    
    private void inOrder(NodoB actual){
        if(actual != null){
            inOrder(actual.getIzquierda()); //travers left side
            System.out.print("[" + actual.getDato() + "]");//visit node
            inOrder(actual.getDerecha()); //travers right site

        }
}
}


