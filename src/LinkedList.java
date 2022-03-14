public class LinkedList {
    public Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int[] values) {
        head = new Node(values[0]);
        Node n = head;
        for (int i=1; i<values.length; i++) {
            Node adding = new Node(values[i]);
            n.setNext(adding);
            n = n.getNext();
        }
    }

    private Node helper(int index){
        //walks to a specific index
        Node current = head;
        Node previous = null;
        for(int i = 0; i<index; i++) {
            previous = current;
            current = current.getNext();
        }
        return previous;
    }
    private Node helper(){
        //walks to end
        Node current = head;
        Node previous = null;
        while (current != null) {
            previous = current;
            current = current.getNext();
        }
        return previous;
    }

    public void add(int v) {
        Node n = new Node(v);
        if (head == null) {
            head = n;
        } else {
            // walk the the list to the end
            helper().setNext(n);
        }
    }

    public void add(int index, int v) {
        Node n = new Node(v);
        if (head == null) {
            head = n;
        } else {
            // walk the the list to the index
            Node prevNode = helper(index);
            //puts it in
            n.setNext(prevNode.getNext());
            prevNode.setNext(n);
        }
    }

    public int size(){
        Node current = head;
        int count = 0;
        while (current != null){
            current = current.getNext();
            count++;
        }
        return count;
    }

    public void addFirst(int v){
        Node n = new Node(v);
        n.setNext(head);
        head = n;
    }

    public void clear(){
        head = null;
    }

    public int getFirst(){
        return head.getValue();
    }

    public int getLast(){
        if(head == null){
            return head.getValue();
        } else {
            Node prevNode = helper();
            return prevNode.getValue();
        }
    }

    public int get(int index){

        return helper(index).getNext().getValue();
    }

    public void set(int index, int v){
        helper(index).getNext().setValue(v);
    }

    public boolean contains(int v){
        //could have used helper function here but with helper time complexity would have been O(n^2) this is O(n) where n is the size of the list
        Node current = head;
        Node previous = null;
        while (current != null) {
            previous = current;
            current = current.getNext();
            if (previous.getValue() == v){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int v){
        Node current = head;
        Node previous = null;
        int counter = 0;
        while (current != null) {
            previous = current;
            current = current.getNext();
            if (previous.getValue() == v){
                return counter;
            }
            counter++;
        }
        return -1;
    }

}