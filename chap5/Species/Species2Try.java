//5.6
public class Species2Try{
    public String name; 
    public int population; 
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("What is the species' name?"); 
        name = keyboard.nextLine();
        System.out.println("What is the population of the " + "species?");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate " + "(% increase per year):");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name = " + name); 
        System.out.println("Population = " + population); 
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public int predictPopulation(int years){
        int result =0;
        double populationAmount = population;
        int count = years;
        while( count>0 && population>0){
            populationAmount = (populationAmount + (growthRate/100)*populationAmount);
            count --;
        }
        if(populationAmount){
            result = (int)populationAmount;
        }
        return result;
    }
}