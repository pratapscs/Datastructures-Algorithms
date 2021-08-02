package com.datastructures.list.singlylinkedlist;

/* Recursive Method:
 * 1) Divide the list in two parts - first node and rest of the linked list.
 * 2) Call reverse for the rest of the linked list.
 * 3) Link rest to first.
 * 4) Fix head pointer.
 * 
 */
public class ReverseSinglyLinkedList<T> 
{
	private Node1<T> head;
    
    public void add(T element)
    {
        Node1<T> nd = new Node1<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        Node1<T> tmp = head;
        while(true)
        {
            if(tmp == null)
            {
                //since there is only one element, both head and 
                //tail points to the same object.
                head = nd;
                break;
            }
            else if(tmp.getNextRef() == null)
            {
                tmp.setNextRef(nd);
                break;
            } 
            else 
            {
                tmp = tmp.getNextRef();
            }
        }
    }
      
    public void traverse(){
          
        Node1<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+"\t");
            tmp = tmp.getNextRef();
        }
    }
     
    public void reverse()
    {
         
        System.out.println("\nreversing the linked list\n");
        Node1<T> prev = null;
        Node1<T> current = head;
        Node1<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
     
    public static void main(String a[])
    {
        ReverseSinglyLinkedList<Integer> sl = new ReverseSinglyLinkedList<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();
    }
}
  
class Node1<T> implements Comparable<T> {
      
    private T value;
    private Node1<T> nextRef;
      
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node1<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(Node1<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }

}
