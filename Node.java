public class Node {
    public int value;
    public Node next = null;
    public Node prev = null;
    public Node(int value) {
        this.value = value;
    }
    public int getVal() {
        return value;
    }
    public void setVal(int value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next; 
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}