public class Node {
    private int value;
    private Node next;

    public Node(int v) {
        value = v;
        next = null;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void display() {
        System.out.println(value);
    }

    public int getValue(){
        return  value;
    }

    public void setValue(int v){
        value = v;
    }
}