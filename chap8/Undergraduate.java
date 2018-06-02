public class Undergraduate extends Student{
//instance variables
    private int level; 
//constructor
    public Undergraduate(){
        super();
        level = 1; //freshman
    }
    public Undergraduate(String initName, int initStudentNum , int initLevel){
        super( initName, initStudentNum);
        setLevel(initLevel);    
    }
//set and gets
    public void setLevel(int newLevel){
        if( (1<=newLevel)&&(newLevel<=4) )
            level = newLevel;
        else {
            System.out.println("Illegal level.");
            System.exit(0);
        }
    }
    public int getLevel(){
        return level;
    }

//methods
    public void reset(String newName, int newStudentNum , int newLevel){
        reset(newName, newStudentNum); //students reset
        setLevel(newLevel); 
    }
    public void writeOutput(){
        super.writeOutput(); //students method
        System.out.println("StudentLevel: "+level);
    }
    public boolean equals(Undergraduate otherUnderG){
        return  equals((Student)otherUnderG) //or super.equals(otherUnderG) // casting it to student class
                &&
                (this.level == otherUnderG.level);
    }
}