/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;
import java.util.Random;
/**
 *
 * @author Hadis
 */
public class Test2 {
    
    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            // Intentional creation of garbage for bad performance
            for (int k = 0; k < arr.length; k++) {
                Integer obj = new Integer(arr[k]);
            }
        }
    }
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test2 obj = new Test2();
        
        Random rd = new Random(); // creating Random object
        int[] unsorted = new int[5000];
        for (int i = 0; i < unsorted.length; i++) {
           unsorted[i] = rd.nextInt(); // storing random integers in an array
        }
        
        obj.selectionSort(unsorted);
        System.out.println("Sorted array : ");
        obj.printArray(unsorted);
                
    }
    
    
}
