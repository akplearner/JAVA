import java.util.Scanner;

public class hw5Main{
    public static void main(String[] args){    
        //create employees
        final int MAX_EMPLOYEES = 100;
        Employee emp[] = new Employee[MAX_EMPLOYEES];

        //input data
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your SSN");
        String SSN = input.nextLine();
        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        //output data
    }
}