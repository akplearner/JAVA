//package generics;
import java.util.ArrayList;


public class  MyList<T extends Comparable<T>> {
//Instance variables
    private ArrayList<T> myList;
    private T max;
    private T min;
//Constuctor
    public MyList(){ 
        myList = new ArrayList<T>();
    }
    
//Methods
    public void add(T x){
        myList.add(x);
    }
   
    /**
     * Method to find maximum of the myList elements.
     */
    public T largest(){
        max = myList.get(0);
        for (int i=1; i<myList.size(); i++){
            if ( myList.get(i).compareTo(max)>0){
                max = myList.get(i);
            }
        }
        return max;
    }
    
    public T smallest(){
        min = myList.get(0);
        for (int index=1; index<myList.size(); index++){
            if(myList.get(index).compareTo(min)<0){
                min = myList.get(index);
            }
        }
        return min;
    }
    
    
    public static void main(String[] args){
        MyList<String> nameList = new MyList<String>();
        nameList.add("Queens");
        nameList.add("Brooklyn");
        nameList.add("Manhattan");
        nameList.add("Bronx");
        nameList.add("Staten Island");
        System.out.println("The largest value string is: " + nameList.largest());
        System.out.println("The smallest vlaue string is: " + nameList.smallest());
    }
 }

