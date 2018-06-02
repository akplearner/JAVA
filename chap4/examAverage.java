import java.util.Scanner;
public class examAverage{
    public static void main(String[] args){
        System.out.println("This program computes the average of \na list of (nonnegative) exam scores.");
        double sum;
        int numberOfStudents=0;
        double next;
        String answer;
        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("\nEnter all the scoes to be averaged.");
            System.out.println("Enter a negative number ater");
            System.out.println("you have entered all the scores.");
            sum = 0;
            next = keyboard.nextDouble();
            while(next>=0){
                sum = sum + next;
                numberOfStudents++;
                next = keyboard.nextDouble();
            }
            if(numberOfStudents>0){
                System.out.println("The average is " + sum/numberOfStudents);
            }else
                System.out.println(" No scores to average.");
                System.out.println("Want to average another exam?");
                System.out.println("Enter yes or no.");
                answer = keyboard.next();
        }while(answer.equalsIgnoreCase("yes"));
    }
}