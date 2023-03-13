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
    
    int fib(int n) {
        if (n==0 || n==1){
            return 1;
        }
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
        return obj1.fib(n-1)+obj2.fib(n-2);
    }
    
    void print(int n) {
        for(int i=0;i<n;i++){
            System.out.println(fib(i));
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test2 obj = new Test2();
        obj.print(45);
                
    }
    
}
