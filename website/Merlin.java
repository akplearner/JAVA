public class Merlin{
//instance variable
    private static Merlin theWizard = null;
//constructor
    private Merlin (){}
//method
    //1.
    public static Merlin summon(){
        if(theWizard == null)
            theWizard = new Merlin();
        return theWizard;
    }
    //2.
    public String consult(){
        return "pull the sword from the stone";
    }
}