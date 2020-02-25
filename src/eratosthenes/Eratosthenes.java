/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes;

/**
 *
 * @author aamir7110
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean numbers[] = new boolean[1000];
        int num[] = new int[1000];
        
        for(int i = 2; i<numbers.length; i++){
        
            num[i] = i;
            System.out.println(num[i]);
            
        }
        
        
    }
    
}
