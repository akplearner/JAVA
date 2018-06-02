//package generics;

public class Gen<T> {
//instance variable
    T thisObject; //declare a reference to an object of type T
//constructor
    //Pass constructor an object of type T
    public Gen(T newObject){
        thisObject = newObject;
    }
//get and set methods
    public T getThisObject(){
        return thisObject;
    }
//Methods
    //Show the type of T
    public void showType(){
        System.out.println("The type of T is "
                + thisObject.getClass().getName());
    }

}