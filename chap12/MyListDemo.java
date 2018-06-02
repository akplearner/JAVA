//package generics;
import java.util.Scanner;
/* This program demonstrates */
public class MyListDemo {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        Point<Integer> p;
        MyList<Point<Integer>> l1 = new MyList<Point<Integer>>(15);
        MyList1<Integer> l2 = new MyList1<>(15);
        
        System.out.println("Enter the number of elements " +  " in the list: ");
        int num = kb.nextInt();
        
        System.out.println("The elements of the list are: ");
        for(int i = 0; i< num; i++){
             p = new Point<Integer>(i, 2*i);
             l1.add(p);
             l2.add(i + 5);
             
             System.out.print(l2.get(i) + " ");
        }
        System.out.println();
        System.out.println(l1.getSize());
        l1.add(5, new Point<Integer>(10, 20));
        l1.add(new Point<Integer>(11, 25));
        
        System.out.println(l1.getSize());
        System.out.println("Enter the index of the " + "element to be removed: ");
        int ind = kb.nextInt();
        System.out.println("The removed element is: \n" + l1.remove(ind));
        System.out.println("The size of the list is: " + l1.getSize());
        kb.close();
    }

}
