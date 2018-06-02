public class Person{
//instance variable
    protected String name;
//construcotrs    
    public Person()
    {
        name = "No name yet";
    }
    public Person(String initialName)
    {
        name = initialName;
    }

//getters and setters
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }

//methods
    public void writeOutput()
    {
        System.out.println("Name: " + name);
    }
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}