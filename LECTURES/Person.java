public class Person{ //this is our perent class!
    //instance variables 
    private String name;
    //constructors
    public Person(){
        name = "Not given";
    }
    public Person(string initialName){
        name = initialName;
    }
    //get and set methods
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    //method
    public String toString(){
        return "name: " + name;
    }
    public boolean equals(Person other){
        return name.equals(other.name); //what does other.name means??
        //return this.name.equalsIgnoreCase(other.name);
    }
}