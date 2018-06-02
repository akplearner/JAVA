public class Student extends Person{
//instance variables
    private int studentNumber;
//Constructor
    public Student(){
        super();
        studentNumber = 0;
    }
    public Student(String initialName, int initialStudentNumber){
        super(initialName); //inherits constructor
        studentNumber = initialStudentNumber;
    }
//set and getters
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }
//methods
    public void reset(String newName, int newStudentNumber){
        setName(newName);//inherited method
        studentNumber = newStudentNumber;    
    }
    public void writeOutput(){
        System.out.println( "Name: "+getName() );//inherited variable
        System.out.println("Student Number: "+ studentNumber);
    }
    public String toString() {
        return "Name: " + getName() + "\nStudent number: " + studentNumber; 
    }
    public boolean equals(Student otherStudent){
        return this.hasSameName(otherStudent) //Inherited Person method 
        &&
        (this.studentNumber == otherStudent.studentNumber);
    }
}