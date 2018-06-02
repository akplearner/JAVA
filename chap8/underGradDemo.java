import java.util.Scanner;

public class underGradDemo{
    public static void main(String[] args){
        Undergraduate cs = new Undergraduate();
        Undergraduate se = new Undergraduate("tony", 12345 , 2);

        cs.writeOutput();
        se.writeOutput();

        //Type compatibility
        Person joePerson = new Person("Josephine Student"); 
        System.out.println("Enter name:"); 
        Scanner keyboard = new Scanner(System.in); 
        String newName = keyboard.nextLine(); 

        Undergraduate someUndergrad = new Undergraduate(newName, 222, 3);
        
        if (joePerson.hasSameName(someUndergrad)) //both should be type person
            System.out.println("Wow, same names!");
        else 
            System.out.println("Different names");
        System.out.println(someUndergrad.hasSameName(joePerson));

        System.out.println( someUndergrad.toString() );
        someUndergrad.reset("new Name",123456789,1);
        System.out.println( someUndergrad.toString() );

    }
}