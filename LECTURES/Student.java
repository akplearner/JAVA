public class Student extends Person{
    //instance variables
    private int studentNumber;
    //Constructor
    public Student (){
        super();
        studentNumber =0;
    }
    public Student(String initialName, int newNumber){
        super(initialName);
        studentNumber = newNumber;
    }

    //get and set methods
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int newNumber){
        studentNumber = newNumber;
    }
    public void setName(String newName){
        setName(newName);
    }

    //methods
    public String toString(){
        return super.toString() + "\nStudent number: " + studentNumber;
    }

    public boolean equals(Student otherStudent){ //inheritance only works one way-> person cant be compare to student bc it lacks idNumber.
        return super.equals(otherStudent) && this.studentNumber ==otherStudent.studentNumber;
    }
}