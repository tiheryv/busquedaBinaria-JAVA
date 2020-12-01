package busquedaBinaria;

public class ordenar {
    /*
    *   Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, 
    *   intercambiándolos de posición si están en el orden equivocado.
    */
    
    public void Ordenar (int[] arreglo){
        int temp;
        boolean cambios = false;
       
        while (true) {            
            cambios = false;
            
            for (int i = 1; i < arreglo.length; i++) {
            
                if (arreglo[i] < arreglo[i-1]) {
                    
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = temp;
                    cambios = true;       
                }
            }if(cambios==false) {
                break;           
            }
        }
    }
}
