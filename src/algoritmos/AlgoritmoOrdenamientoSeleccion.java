/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author josuealexis96
 */
public class AlgoritmoOrdenamientoSeleccion {
    
    public void Seleccion(int arr []){//Se declara el metodo que se implementara
        
        for(int i = 0; i < arr.length - 1; i++){//Se inicia un ciclo for para recorrer una posición
            //del arreglo
            int m = i;//Apuntador
            for(int j = i + 1; j < arr.length; j++){//Dentro del mismo ciclo for se inicia otro ciclo para
                //que otra variable se recorra mientras la otra variable esta en movimiento
                if(arr[j] < arr[m]){//En caso de que el valor en la posición j sea
                    //menor al valor ubicado en la posición m
                    m = j;//Se guarda la posición j en la posición m
                }
            }
            int auxiliar = arr[i];//Se guarda el valor que esta en la posición
            //i en una variable auxiliar
            arr[i] = arr[m];//Se guarda el valor en la posición m en la de i
            arr[m] = auxiliar;//Se guarda el valor que se guardo en la variable auxiliar
            //en la posición m
        }    
    }
    
    public int [] CrearVector(){//Se crea un metodo para pedirle al usuario los valores que
        //quiere poner el vector y su respectivo tamaño
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Escribe el tamaño del arreglo: ");
        int n = sc.nextInt();
        int vector[] = new int [n];
       
        for (int i = 0; i < n; i++){//Se va recorriendo el puntero en el arreglo
            //para que el usuario inserte el número que guste
            System.out.print("Escribe el dato " + i + " : ");
            vector[i] = sc.nextInt();//Se guarda el numero dado en la una posicion del vector
        }
        return vector;
    }
    
    public void mostrarVector(int [] vector){//Se crea un metodo para
    //desplegar los valores que se encuentran en el vector
    for(int i = 0; i < vector.length; i++){//Se hace un ciclo for
    //y va recorriendo el vector y desplegando los valores
    //que tiene guardado
        System.out.print(" [ " + vector[i] + " ] ");
        }
    }

}
