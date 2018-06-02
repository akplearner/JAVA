public class DogDemo{
    public static void main(String[] args){
        System.out.println("\n ___________________\n");
        Dog balto = new Dog();
        balto.name = "Balto";
        balto.age = 8;
        balto.breed = "Siberian Husky";
        balto.writeOutput();
        System.out.println("\n ___________________\n");
        Dog scooby = new Dog();
        scooby.name = "Scooby Doo";
        scooby.age = 42;
        scooby.breed = "Catooon";
        scooby.writeOutput();
        System.out.println("scooby gage in human years is: "+scooby.ageInHumanYears());
        System.out.println("\n ___________________\n");
    
    }
}