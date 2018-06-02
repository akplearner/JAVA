// Class 4: Loops work as in C++ 
// Print list of Square roots.

import java.util.Scanner;
public class loop1 { 
    public static void main(String args[]) {
         for (int x = 1; x <= 10; x++) // loop 10 times 
         System.out.println(x + "\t" + Math.sqrt(x)); 
            // Math.sqrt() for square roots 
            System.out.println(); 
            for (int x = 1; x <= 10; x++) 
                System.out.format("%2d%7.3f\n", x, Math.sqrt(x)); 
                // format is an alternative 
                // to println to control output 
                // layout 
    } 
} 