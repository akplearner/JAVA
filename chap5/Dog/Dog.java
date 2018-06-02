public class Dog{

    //instance variables
    String name;
    String breed;
    int age;

    //methods
    public void writeOutput(){
        System.out.println("Name: "+name+"\nBreed: "+breed+"\nAge in calendar years: "+age);
    }
    public int ageInHumanYears(){
        if(age<=2){return age*11;
        }else{return 22+((age-2)*5);}
    }
}