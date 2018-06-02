// Class 5: Functions are coded as static methods --- static is fully explained in Chapter 6 
// Print table of cubes of first 20 integers 
public class Function1{
    public static void main(String[] args){
        for (int x = 1; x <= 20; x++) { 
            System.out.format("%3d %5d\n", x, cube(x));
        } 
    } 
    public static int cube(int x) { 
        // title line is public static but otherwise as in C++ 
        return x * x * x; // block of code for function 
        } 
    
}
