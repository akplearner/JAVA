import java.util.Scanner;
public class SpeciesFourTryDemo{
    public static void main(String[] args){
        SpeciesFourTry speciesOfTheMonth = new SpeciesFourTry();

        System.out.println("Enter number of years to project:");
         Scanner keyboard = new Scanner(System.in);
         int numberOfYears = keyboard.nextInt();

        System.out.println("Enter data on the Species of the month:");
         speciesOfTheMonth.readInput();
         speciesOfTheMonth.writeOutput();

        int futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
        System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
        
        speciesOfTheMonth.setSpecies("Klingon ox", 10, 15); 
        System.out.println("The new Species of the Month:"); 
        speciesOfTheMonth.writeOutput();
        futurePopulation =speciesOfTheMonth.predictPopulation(numberOfYears); 
        System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
    }
}