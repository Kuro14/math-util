/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author ACER
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ta test thu ham cua ta
        // dung mat de so sanh ket qua thuc te khi chay va ket qua ta mong oi
        long expected = 120;//ta ong nhana 120 neu goi ham 5! 
        long actual  = phat.util.MathUtility.getFactorial(5);
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);
        
        //expected: 720 if tinhs 6!
        System.out.println("6!: " + phat.util.MathUtility.getFactorial(6));
        
        //expected: 1 if tinh 0!
        System.out.println("0!: " + phat.util.MathUtility.getFactorial(0));
        
        //expected: IllegalArgumentException if tinh -5!
        System.out.println("-5: " + phat.util.MathUtility.getFactorial(-5));
    }
    
}
