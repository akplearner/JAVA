//5.4
public class Species1TryDemo{
    public static void main(String[] args){
        SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
        
        System.out.println("Enter data on the speces of the Month");
         speciesOfTheMonth.readInput();
         speciesOfTheMonth.writeOutput();
        int futurePopulation = speciesOfTheMonth.getPopulationIn10();
        System.out.println("In ten years the population wil be " + futurePopulation);
        //changing object
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10; 
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
         speciesOfTheMonth.writeOutput();
        System.out.println("In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());
    }
}