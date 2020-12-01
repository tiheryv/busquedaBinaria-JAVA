
package busquedaBinaria;
/*
 * Busqueda binaria
 *      La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una 
 *      lista ordenada de elementos. 
    
 *      Funciona al dividir repetidamente a la mitad la porción de la lista que podría 
 *      contener al elemento, hasta reducir las ubicaciones posibles a solo una.
*/
public class busquedaBin {
    public static void buscar (int [] arreglo, int numBuscar){
        
        boolean encontrado = false;
        int inferior = 0, superior=0, medio = 0;
        
        while (inferior <= superior) {
            medio = (inferior+superior)/2;
            
            if (numBuscar == arreglo[medio]){
                encontrado = true;
                break;
                
            }if (numBuscar < arreglo[medio]) {
                inferior = medio;
                medio = (inferior+superior)/2;
                
            }if (numBuscar > arreglo[medio]){
                superior = medio;
                medio = (inferior+superior)/2;
            }
            
        }
        if (encontrado==true) {
            System.out.println("El numero ha sido encontrado en la posicion:"
                                +medio);
        }else{
            System.out.println("El numero NO ha sido encontrado");
        }
    }
}
