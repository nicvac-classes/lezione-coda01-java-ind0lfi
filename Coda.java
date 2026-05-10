//Implementare qui la classe Coda
public class Coda<T> {
    private Nodo<T> head;
    private Nodo<T> tail;

    public Coda() {
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty(){
        if(head.dato==null){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        int c=0;
        Nodo<T> curr=head;
        while(curr!=null){
            curr=curr.next;
            c++;

        }
        return c;
    }
}
