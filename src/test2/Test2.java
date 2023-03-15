/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;

/**
 *
 * @author Hadis
 */
public class Test2 {
    
    int binomialCoeff(int n,int k) {
        if (k>n)
            return 0;
        if (k==0 || n==k)
            return 1;
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
        return obj1.binomialCoeff(n-1,k-1)+obj2.binomialCoeff(n-1,k);
    }
    
    void print(int n) {
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(binomialCoeff(i,j)+" ");
            }
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test2 obj = new Test2();
        obj.print(30);
                
    }
    
    
}
