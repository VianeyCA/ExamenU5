package examenu5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ExamenU5 {

     public static void main(String[] args) {
         // TODO code application logic here
         System.out.println("El archivo .txt debe tener comas para leerse");
         System.out.println("");
         try {
             //Leer el archivo
             BufferedReader bf;
             FileReader fr;
             String numeros;
             String Arreglo[];
             fr = new FileReader("C:\\Users\\Graciela\\Desktop\\Hola.txt");
             bf = new BufferedReader(fr);
             //Traspasar el archivo a una variable
             numeros = bf.readLine();
             Arreglo = numeros.split(",");
             System.out.println("Numeros encontrados en el archivo: "+"\n"+ Arrays.toString(Arreglo));
             
             //
             bf.close();
             fr.close();
             int A[] = new int[Arreglo.length];
              
             for (int i = 0; i < Arreglo.length; i++) {
                 A[i] = Integer.parseInt(Arreglo[i]);
             }
             System.out.println("");
             Shellsort(A);
             System.out.println("Números ordenados de acuerdo a el método ShellSort: \n" + Arrays.toString(A));

         } catch (IOException ex) {
             System.out.println("Fin del programa");
         }
      }

     public static void Shellsort(int arreglo[]){
         int i, j, k, aux, salto;
         salto=arreglo.length/2;
         while (salto>0){
             j=salto;
             for (i = salto; i < arreglo.length; i++) {
                 j=i-salto;
                 while(j>=0){
                     k=j+salto;
                     if(arreglo[j]>=arreglo[k]){
                         aux=arreglo[j];
                         arreglo[j]=arreglo[k];
                         arreglo[k]=aux;
                         j-=salto;
                     }else{
                         break;
                     }
                 }
             }
             salto/=2;
         }
     }
}
