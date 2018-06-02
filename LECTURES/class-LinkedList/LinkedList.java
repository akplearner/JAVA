import java.util.Scanner;

public class LinkedList<T> {
   private Node<T> head, tail;
   private int size;

   public LinkedList(){
      head = tail = null;
      size = 0;
   }

   public int getSize(){
      return size;
   }
   
   public boolean isEmpty(){
      return size == 0;
   }

   public T getFirst(){
      if(isEmpty())
         return null;
      return head.getData();
   }

   public void addHead(T d){
      Node<T> n = new Node<>(d, head);
      head = n;
      if(tail == null)
         tail = head;
      size++;
   }

   public void addTail(T d){
      Node<T> n = new Node<>(d, null);
      if (tail == null)
         head = tail = n;
      else{
         tail.setNext(n);
         tail = n;
      }
      size++;
   }

   public T removeHead() throws Exception{
      if(head == null)
         throw new Exception("Empty List");
      Node<T> n = head;
      head = head.getNext();
      if(head == null)
         tail = head;
      size--;
      return n.getData();
   }

   public String toString(){
      String ans = "";
      Node<T> n = head;
      ans += "(H)-->";
      while(n != null){
         ans += n.getData();
         ans += "-->";
         n = n.getNext();
      }
      return ans + "(T)";
  }

  public static void main(String[] args){
     LinkedList<String> l = new LinkedList<>();
     Scanner kb = new Scanner(System.in);
     while(true) {
        System.out.println(l + " commands are H T R Q: ");
        String command = kb.next();
        if (command.charAt(0) == 'Q')
           break;
        if (command.charAt(0) == 'R')
           try{
              l.removeHead();
            } catch(Exception e){
                 System.out.println("Remove failed. List was empty.");
            }
        else{
           String entry = kb.next();
           if(command.charAt(0) == 'H')
              l.addHead(entry);
           else
              l.addTail(entry);
        }
      }
      kb.close();
   }
}