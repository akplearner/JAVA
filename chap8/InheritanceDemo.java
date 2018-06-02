public class InheritanceDemo{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Warren Peace"); //inherited from person class
        s.setStudentNumber(1234);
        s.writeOutput();
    }
}