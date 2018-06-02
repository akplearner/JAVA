import java.util.Scanner;

public class Employee extends Person{
    public final static int MAX_SSN_LENGHT = 9;
    private String SSN;
    private double salary;


//constructor
public Employee(){
    super();
    SSN = "NA";
    salary = 0.0;
}

public Employee(String newName, String newSSN, double newSalary){
    super(newName);
    SSN = newSSN;
    salary = newSalary;
}

//getters
public void setSSN(String newSSN) throws SSNLengthException,SSNCharacterException{
            if(newSSN.length()!=9){ 
                throw new SSNLengthException();
            }
            
            try{
                Integer numSSN= Integer.parseInt(newSSN);
            }
            catch(NumberFormatException errorChar){
                throw new SSNCharacterException();
            }
            SSN=newSSN;
}
public String getSSN(){ return this.SSN; }

public double getSalary(){ return salary;}
public void setSalary(double newSalary){ salary = newSalary; }
//input method
//output method
    public String toString(){
        return "Name of employee is "+this.getName()+" salary is "+this.salary +", and social "+this.SSN; 
    }
}