import  java.util.ArrayList;
public class Objects5{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<10 ; i++){
            list.add(10+i); //add(int i, value)
            System.out.print(list.get(i)+ " ");
        }
        
        System.out.println();
        list.add(2,13); //creates a new element at index i.
        System.out.println(list.size());
        list.set(2,13);
        //System.out.println(list.get(2)+" "+list.)
        //System.out.println("New size of the list: ");
        list.set(2,15); // replacesvalue set(int i,value) at index i.
        System.out.println(list.size());
        list.remove(2); //remove element with index i.
        
    }

}