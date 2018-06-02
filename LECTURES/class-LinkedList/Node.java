public class Node<T> {
    private T data;
    private Node<T> next;
    
    public Node(){
       data = null;
       next = null;
    }
 
    public Node(T d, Node<T> n){
       data = d;
       next = n;
    }
 
    public T getData(){
       return data;
    }
 
    public Node<T> getNext(){
       return next;
    }
 
    public void setData(T d){
       data = d;
    }
   
    public void setNext(Node<T> n){
       next = n;
    }
 
    static Node startPrint = null;
    public String toString(){
       if(startPrint == null)
          startPrint = this;
       String ans = "";
       Node<T> n = this;
       while(n != null){
          ans += n.getData();
          ans += "-->";
          n = n.getNext();
          if( n == startPrint){
            ans += " ... ";
            break;
          }
       }
       startPrint = null;
       return ans += "=";
    }
 
    public static void main(String[] args){
       Node<String> g = new Node<>("Red", null);
       Node<String> f = new Node<>("Orange", g);
       Node<String> e = new Node<>("Yellow", f);
       Node<String> d = new Node<>("Green", e);
       Node<String> c = new Node<>("Blue", d);
       Node<String> b = new Node<>("Indigo", c);
       Node<String> a = new Node<>("Violet", b);
 
       System.out.println(a);
       System.out.println(e);
       g.setNext(a);
       System.out.println(g);
    }
 }