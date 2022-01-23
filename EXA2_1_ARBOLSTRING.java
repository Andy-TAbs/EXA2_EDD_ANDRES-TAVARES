
package arbolbinariotexto;

import javax.swing.JOptionPane;



public class EXA2_1_ARBOLSTRING {

    
    
    public static void main(String[] args) {
        int opc = 0;
      String nom;
      ArbolBinario arbcreado = new ArbolBinario();
      do{
          try{
             opc = Integer.parseInt(JOptionPane.showInputDialog (null,
                     "1. Agregar nodo\n"
                             + "2. Recorrer el árbol InOrder\n"
                             + "3. Recorrer el árbol PostOrder\n"
                             + "4. Recorrer el árbol PreOrder\n"
                             + "5. Salir \n"
                             ,"Árbol binario de Strings"
                     ,JOptionPane.QUESTION_MESSAGE));
             switch (opc){
                 case 1:
                     nom = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo:  ","Agregando nodo"
                             ,JOptionPane.QUESTION_MESSAGE);
                     arbcreado.agregaNodo(nom);
                     break;
                 case 2:
                     if(!arbcreado.arbvacio()){
                         System.out.println();
                         arbcreado.printInOrder();
                     }else{
                         JOptionPane.showInputDialog(null, "El árbol esta vacio"
                             ,JOptionPane.QUESTION_MESSAGE);
                     }
                     break;
                      case 3:
                     if(!arbcreado.arbvacio()){
                         System.out.println();
                         arbcreado.printPostOrder();
                     }else{
                         JOptionPane.showInputDialog(null, "El árbol esta vacio"
                             ,JOptionPane.QUESTION_MESSAGE);
                     }
                     break;
                      case 4:
                     if(!arbcreado.arbvacio()){
                         System.out.println();
                         arbcreado.printPreOrder();
                     }else{
                         JOptionPane.showInputDialog(null, "El árbol esta vacio"
                             ,JOptionPane.QUESTION_MESSAGE);
                     }
                     break;
                 case 5:
                     JOptionPane.showInputDialog(null, "Aplicación finalizada ","Fin"
                             ,JOptionPane.QUESTION_MESSAGE);
                     break;
                 default:
                     JOptionPane.showInputDialog(null, "Opción incorrecta","¡Cuidado!"
                             ,JOptionPane.QUESTION_MESSAGE);
                     break;
               
                     
                 }
          }catch (NumberFormatException n){
                     if ("null".equals(n.getMessage())){
                     break;
                 }else{
                         JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                         }
             }
      }while(opc != 5);
    }
    
}
