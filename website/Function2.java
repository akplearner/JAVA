import java.util.Scanner;
public class Function2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter a number or -1 to stop: ");
            x = input.nextInt();
            if(x >= 0){
                String plural = "s";
                int y = numDigits(x);
                if(y==1) plural = "";
                System.out.format("%8d has %2d digit%s\n",x,numDigits(x),plural);
            }
        }while(x>=0);
        input.close();
    }
    public static int numDigits(int x){
        if(x<10) return 1;
        return 1 + numDigits(x/10);
    }
}