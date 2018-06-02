import java.util.Scanner;
import java.util.ArrayList;


public class demo{

    public static void main(String[] args){
        ArrayList<Employee> eArray = new ArrayList<Employee>();
        double sumSalary=0;
        Employee e;
        for(int i=0 ; i<100 ; i++){
            System.out.println("----------"+"");
            Scanner kb = new Scanner(System.in);
            e = new Employee();//String name, String SSN, double salary
            //Asking users
            System.out.println("(type exit anywhere to exit.)");
            System.out.println("Enter name: ");
            String name = kb.nextLine();
                if( name.equalsIgnoreCase("exit") ){ break; }
                e.setName(name);
            System.out.println("Enter salary: ");
            String salaryString = kb.nextLine();
                if( salaryString.equalsIgnoreCase("exit") ){ break; }
                double salary=Integer.parseInt(salaryString);
                e.setSalary(salary);    
            while(true){
                try{
                    System.out.println("Enter SSN: ");
                    String SSN = kb.next();
                    if( SSN.equalsIgnoreCase("exit") ){ 
                        break; 
                    }
                        e.setSSN(SSN);
                    break;
                }catch(SSNLengthException error){
                        System.out.println("Entered SSN length is incorrect."+ "\n Enter your information again please." );
                        continue;
                }
                catch(SSNCharacterException error){
                    System.out.println("Entered SSN Characters are incorrect."+ "\n Enter your information again please." );
                    continue;
                }
            }
            eArray.add(e);
            sumSalary+=salary;
        }
        double average = sumSalary/eArray.size();
        System.out.println("\nAverage: " + average+"\n");
        for(int i=0; i<eArray.size() ; i++){
            Employee temp = eArray.get(i);
            System.out.println("guy["+ i +"] :"+temp.toString());
            if(temp.getSalary() <average){ System.out.println("  Below average!"); }
            else{System.out.println("  Above average!");}
        }
    }
}