//package generics;

public class GenDemo {
    public static void main(String[] args){
        //Create a Gen reference for Integers
        Gen<Integer> iOb;
        //Create a Gen<Integer> object and assign its reference to iOb. 
        //Notice the use of autoboxing to encapsulate the value 88 within Integer object
        
        iOb = new Gen<Integer>(88);
        
        // Show the type of data used by iOb.
        iOb.showType();
        
        //Get the value in iOb. There is no need to cast.
        int v = iOb.getThisObject();
        System.out.println("Value: " + v);
        
        System.out.println();
        
        //Create a Gen object for Strings
        Gen<String> strOb = new Gen<>("Generics Test");
        
        //Show the type of the data
        strOb.showType();
        
        //Get the value in strOb again. Notice that no cast is required
        String str = strOb.getThisObject();
        System.out.println("Value: " + str);
    }

}