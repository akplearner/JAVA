//package generics;

import java.util.ArrayList;

public class MyList1<T extends Number & Comparable <T>> {
    
    private ArrayList<T> myList;
    private T max;
    private T min;
    
    public MyList1(){ 
        myList = new ArrayList<T>();
    }
    
    
    public void add(T x){
        myList.add(x);
    }
    
    /**
     * Method to find maximum of the myList elements.
     */
    public T largest(){
        max = myList.get(0);
        for (int i=1; i<myList.size(); i++){
            if (myList.get(i).compareTo(max) > 0 ){
                max = myList.get(i);
            }
        }
        return max;
    }
    
    public T smallest(){
        min = myList.get(0);
        for (int index=1; index<myList.size(); index++){
            if(myList.get(index).compareTo(min) < 0){
                min = myList.get(index);
            }
        }
        return min;
    }
    
    public static void main(String[] args){
        MyList<Integer> list = new MyList<Integer>();
        for(int i=0; i<7; i++)
            list.add(3*i - 2);
        int x = list.largest();
        int y = list.smallest();
        System.out.println("The largest value is:" + x);
        System.out.println("The Smallest value is: " + y);
    }
}
