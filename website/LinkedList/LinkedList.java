public class LinkedList<T>{
//instance variable    
    private Node<T> head, tail;
    private int size;
//constructor
    public LinkedList(){
        head = tail = null;
        size = 0;
    }
//methods
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    //for the first node 
    public Node<T> getFirst(){
        if( isEmpty() ){
            return null;
        }else{
            return head.getData();
        }
    }
    //method to change list
    public void addHead(E d){
        Node<E> n = new Node<E>(d,head); // we need to create new head which will be infront
        //no neeed to put Node<E> we can leave it as Node<> of java 8 and on.
        head = n; //is going to be infront of prevois head therefor becomes new head
        size++;
        if(tail == null)
            tail = head;
    }
    public void addTail(E d){ 
        Node<T> n = new Node<>(d,null); //tail always created will null because there is nothing behind it.
        //there cant be 2 null tails because then they would not be linked
        if(tail ==null)
            head = tail = n;
        else{
            tail.setNext(n);
            tail = n;
        }
        size++;
    /** The inkedList that wwe are looking at is a singly LinkedList.
     * It has only one connection to next node (i.e: the node that comes after)
     * In such a list, head is always connected to the next node  and the tail has no next connection (i.e: Node<T> connection is null)
     */
    }
}