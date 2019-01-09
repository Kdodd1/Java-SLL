import java.util.ArrayList;

public class SinglyLinkedList {
    public Node head = null;
    public SinglyLinkedList() {
    }

    public SinglyLinkedList add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(new Node(value));
        }
        return this;
    }  
    public SinglyLinkedList remove() {
        if(this.head == null) {
            return this;
        } else {
            Node runner = this.head;
            while(runner.getNext().getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(null);
        }
        return this;
    }
    public SinglyLinkedList find(int index) {
        if(this.head == null) {
            return this;
        } else {
            int counter = 0;
            Node runner1 = this.head;
            while(counter != index) {
                runner1 = runner1.getNext();
                counter++;
            }
            System.out.println(runner1.value + " is at index: " + index );
        }
        return this;
    }
    public SinglyLinkedList removeAt(int index) {
        if(this.head == null) {
            return this;
        } else {
            Node runner1 = this.head;
            if(index == 0) {
                this.head = this.head.getNext();
            }else{
                int counter = 1;
                while(counter != index) {
                    runner1 = runner1.getNext();
                    counter++;
                }
                runner1.setNext(runner1.getNext().getNext());
            }
        }
        return this;
    }
    public ArrayList<Integer> printValues() {
        ArrayList <Integer> list = new ArrayList<Integer>();
        Node runner = this.head;
        while(runner != null) {
            list.add(runner.getVal());
            runner = runner.getNext();
        }
        return list;
    }  
}