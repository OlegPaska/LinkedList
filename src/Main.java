class Main {
    public static void main(String[] args) {
        System.out.println("Linked list demo!");
        // create some nodes
        Node n1 = new Node(13);
        Node n2 = new Node(7);
        Node n3 = new Node(68);
        n1.setNext(n2);
        n2.setNext(n3);
        n1.display();

        // create a linked list
        int[] data = {1,2,3,4,5};
        LinkedList myList = new LinkedList(data);
        myList.addFirst(0);
        myList.add(2, 999);
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.set(2, 888);
        System.out.println(myList.get(2));
        System.out.printf("ASDFASDFASDF      "+myList.indexOf(888));
        //myList.clear();
        myList.head.display();
        myList.head.getNext().display();
        myList.head.getNext().getNext().display();
        myList.head.getNext().getNext().getNext().display();
        myList.head.getNext().getNext().getNext().getNext().display();
        System.out.println("size");
        System.out.println(myList.size());
        myList.head.display();


        System.out.println("ljkdfgsjksdfgl;jkasdfgjkl;sdfgjkl;sdfglkdfskldfgljkdfgljkasdf");

        IBList IB = new IBList(new int[]{0,1,2,3,4,5,6});
        IB.resetNext();
        IB.addItem(2);

        IB.resetNext();
        System.out.println(IB.getNext());

    }
}