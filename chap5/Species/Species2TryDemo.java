import java.util.Scanner;

public class Species2TryDemo{
    public static void main(String[] args){
        Species2Try speciesOfTheMonth = new Species2Try();
        System.out.println("Enter data on the speces of the Month");
         speciesOfTheMonth.readInput();
         speciesOfTheMonth.writeOutput();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the projected number of years:");
        int projectedYears = keyboard.nextInt();
        int futurePopulation = speciesOfTheMonth.predictPopulation(projectedYears);
        System.out.println("In "+projectedYears+" years, the population will be"+futurePopulation);
        //changing object
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10; 
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
         speciesOfTheMonth.writeOutput();
        System.out.println("In ten years the population will be " + speciesOfTheMonth.predictPopulation(10));
    }
}