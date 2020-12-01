

package busquedaBinaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño de tu arreglo: ");
        int tam = entrada.nextInt();
        
        //Declaracion de arreglo
        int [] arreglo = new int [tam];
       
        //Insertar elementos al arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un numero para la posicion " + i + " del arreglo: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Mostrar arreglo
        System.out.println("CONTENIDO DEL ARREGLO:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo ["+i+"] = "+ arreglo[i]); 
        }
       
        //Invocamos el metodo Ordenar
        ordenar o = new ordenar();
        o.Ordenar(arreglo);
        
        //Mostramos el arreglo ordenado
        System.out.println("ARREGLO ORDENADO:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo [" +i+ "] = "+arreglo[i]);
        }
        
        System.out.println("Digite el numero que desea buscar: ");
        int numBuscar = entrada.nextInt();
       
        //Invocamos el metodo buscar
        busquedaBin busca = new busquedaBin();
        busca.buscar(arreglo, numBuscar);
       
        
    }
    
}
    