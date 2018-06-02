//....miss begining code

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
    if(startPrint == null){
        startPrint = this;
    }
    String ans= "";
    Node<N> n = this;
    while(n! ==null){
        ans +=n.getData();
        ans +="-->";
        n=n.getNext();
        if(n==startPrint){
            ans +=" ... ";
            break; //link your list in circular manner so we can break it
        }
    }
    startPrint = null;
    return ans + "=";
}