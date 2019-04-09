/**Queue: Implementation of queue by developing a linked list.
 * Following code implements First in First Out principle(FIFO)
 * Dequeue and Enqueue takes O(1) time in this implementation.
 * Created by Arvind Bahl on 9/4/2019.
 */

public class Queue {

    // class variables, head node - first node is linked list, tailnode -last node in linked list
    private Node headNode;
    private Node tailNode;
    private int numElements;

    // constructor for the queue class
    public Queue(){
        headNode =null;
        tailNode= null;
        numElements=0;
    }

    // Node class, which store data type and the pointer to next node.
    class Node{
        String data;
        Node nextNode;

        public Node(){

            data=null;
            nextNode=null;
        }

    }

    // isEmpty function which return true if queue is empty
    public boolean isEmpty(){

        return (numElements ==0);
    }

    // size method returns the number of element in the queue
    public int size(){
        return numElements;
    }

    // peek method outputs the first element string in the queue
    public String peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return "'No Elements in queue'";
        }
        return headNode.data;
    }

    // public enqueue method to add element in the queue
    public void enqueue(String element){

        if (isEmpty()){
            Node newhnode = new Node();
            newhnode.data= element;
            Node newtailnode  = new Node();
            newhnode.nextNode = newtailnode;
            headNode = newhnode;
            tailNode = newtailnode;
            numElements++;
            return;
        }

        tailNode.data = element;
        Node newtnode1 = new Node();
        tailNode.nextNode =newtnode1;
        tailNode = newtnode1;
        numElements++;
        return;

    }

    //public dequeue method to get and delete first element in the queue
    public String dequeue(){

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return "No Elements in queue";
        }

        String returnString= headNode.data;
        headNode =headNode.nextNode;
        numElements--;
        return returnString;


    }

    //printQueue method print all the elements from head to tail.
    public void printQueue(){

        Node temNode = headNode;
        for (int i =0; i<numElements; i++){

            System.out.println(temNode.data);
            temNode = temNode.nextNode;
        }
    }

    public static void main(String[] args){

        Queue rankqueue = new Queue();
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());

        rankqueue.enqueue("First Person");
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());

        rankqueue.enqueue("Second Person");
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());

        rankqueue.enqueue("Third Person");
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());

        rankqueue.printQueue();

        System.out.println("The dequeue operation on the queue " + rankqueue.dequeue());
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());
        rankqueue.printQueue();

        System.out.println("The dequeue operation on the queue " + rankqueue.dequeue());
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());
        rankqueue.printQueue();

        System.out.println("The dequeue operation on the queue " + rankqueue.dequeue());
        System.out.println("Is the queue empty " + rankqueue.isEmpty());
        System.out.println("The size of the queue " + rankqueue.size());
        System.out.println("The peek of the queue " + rankqueue.peek());
        rankqueue.printQueue();

    }
}
