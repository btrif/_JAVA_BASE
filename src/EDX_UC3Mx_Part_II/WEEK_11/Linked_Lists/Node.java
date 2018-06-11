package EDX_UC3Mx_Part_II.WEEK_11.Linked_Lists;

//  Created by Bogdan Trif on 08-06-2017 , 12:54 PM.


public class Node {
    private Object elem ;
    private Node next ;

    public Node(Object e, Node n){
        elem = e ;
        next = n ;
    }

    // Setters
    public void setElem(Object e) {elem = e;}
    public void setNext(Node n) { next = n; }
    // Getters
    public Object getElem () { return elem ; }
    public Node getNext () { return next ; }
}
