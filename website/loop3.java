import java.util.Scanner;
//Class 4: Loops --- all numbers less than 1000 with digit sum 13, 10 per line
public class loop3{
    public static void main(String[] args){
        int outputCount = 0;
        
        for (int n = 1; n < 1000; n++) {
            // for loop when number of repeats known
            int digitSum = 0; 
            int copy = n; 
            while (copy > 0) { 
                // while loop when count is uncertain 
                digitSum += copy % 10;
                copy /= 10;
            } 
            if (digitSum == 13) {
                System.out.format("%4d", n); 
                // formatted output for one decimal integer 
                outputCount++; 
                if (outputCount >= 10) { 
                    outputCount = 0; 
                    System.out.println(); 
                } 
            } 
        } 
        System.out.println("Hi"); 
    } 
}