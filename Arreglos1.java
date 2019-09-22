/*
Elabore un programa que lea en una lista, una serie de
números enteros, calcule la media de los n números e indique
cuantos de los números dados son iguales a la media. 
*/

import java.util.Scanner;

public class Arreglos1{
   public static void main(String args[]){
      
      Scanner entrada = new Scanner(System.in);
      int n;
      int suma = 0;
      int cont = 0;
      float prom;
      //Vamos a ver si me detecta
      
      System.out.print("Tamaño de la lista: ");
      n = entrada.nextInt();
      int num[] = new int[n];
      
      for(int x = 0; x < n; x++){
         System.out.printf("Ingresa un numero entero %d: ", x + 1);
         num[x] = entrada.nextInt();
      }
      
      for(int x = 0; x < n; x++)
         suma += num[x];  
         
      prom = suma / (float)n;
      System.out.printf("La media es: %.2f\n", prom);
      
      for(int x = 0; x < n; x++)
         if(num[x] == prom)
            cont++;
      
      System.out.printf("Existen %d numeros iguales a la media", cont);
      
  }
}