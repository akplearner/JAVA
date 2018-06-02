public class MerlinTest{
    public static void main(String[] args){
        //if we try to create Merline object using
        //constructor, we get an error.
        //Merline wizard = new Merlin();

        Merlin wizard1 = Merlin.summon();
        Merlin wizard2 = Merlin.summon();

        System.out.println(wizard1.consult());
        System.out.println(wizard2.consult());
    }
}