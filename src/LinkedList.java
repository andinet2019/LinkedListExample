public class LinkedList {
    static Node head;
    public void append(Object data){
        //check if the head is null
        if(head == null){
            head = new Node(data);
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            //move to next node
            currentNode = currentNode.next;
        }
        //add node to end of linked list
        currentNode.next = new Node(data);
    }

    public void prepend(int data){
        //instantiate new node obj
        Node newHead = new Node(data);
        //changing newHead reference to head node
        newHead.next = head;
        head = newHead;
    }
    public static int listLength(Node node){
        //init variable to keep count
        //get currentNode to track iteration
        //iterate through LinkedList
        //if currentNode is not null add to count
        //return nodeCount
        int nodeCount = 0;
        Node currentNode = head;
        while(currentNode != null){
            //do stuff
            nodeCount++;
            currentNode  = currentNode.next;
        }
        return nodeCount;
    }
    public static void main(String[] args) {
        Node list = new Node("Apple");
        list.next = new Node("Orange");
        list.next.next = new Node("Banana");
        list.next.next.next = new Node("Carrot");
        list.next.next.next.next = new Node("Beet");
        System.out.println(listLength(list));
    }
}