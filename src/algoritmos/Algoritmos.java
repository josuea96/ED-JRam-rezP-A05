//Josué Alexis Ramírez Pérez A00513622 ITIC 5ª Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author josuealexis96
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        //Scanner sc = new Scanner (System.in);
        
        //System.out.print("Escribe el tamaño del arreglo: ");
        //int n = sc.nextInt();
        //int vector[] = new int [n];
        
        AlgoritmoOrdenamientoSeleccion Selección = new AlgoritmoOrdenamientoSeleccion();
        int[] vector = Selección.CrearVector();
        System.out.println("El arreglo desordenado es:");
        Selección.mostrarVector(vector);
        Selección.Seleccion(vector);
        System.out.println("");
        System.out.println("El arreglo ordenado es:");
        Selección.mostrarVector(vector);
    }
}
