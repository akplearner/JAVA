import java.util.Random;

//chapter 6: objects
//code uses predifined objects type: random
public class Objects1{
    public static void main(String[] args){
        Random r; //declare objects as variable with class type.
        r = new Random(); //constructor  -- allocate memory for it and initiaize it.
        for(int i=0 ; i<26 ; i++){
            System.out.println((char)(r.nextInt(26)+65));  //apply the nextInt method to  generate
                                                           //random numbers between 0to 5
        }
        for(int i=0 ; i<1 ; i++){
            System.out.println(r.nextDouble()); //method prints random decimal between 0 and 1.
        }
        
    }
}