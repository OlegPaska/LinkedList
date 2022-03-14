public class IBList {
    public Node head;
    private Node cursor;


    public IBList(int[] values) {
        head = new Node(values[0]);
        Node n = head;
        for (int i=1; i<values.length; i++) {
            Node adding = new Node(values[i]);
            n.setNext(adding);
            n = n.getNext();
        }
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

    public void resetNext(){
        cursor = head;
    }

    public void addItem(int v){
        Node n = new Node(v);
        if (head == null) {
            head.setNext(n);
        } else {
            // walk the the list to the end
            helper().getNext().setNext(n);
        }
    }

    public boolean hasNext(){
        if (cursor.getNext() != null){
            return true;
        }else{return false;}
    }

    public int getNext(){
        cursor = cursor.getNext();
        return cursor.getValue();
    }

    public boolean isEmpty(){
        if(head == null){
            return  true;
        }else{return false;}
    }
}
