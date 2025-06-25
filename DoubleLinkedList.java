public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";
    private static final int NOT_FOUND = -1; //Try to avoid the magic numbers.


    private String name;
    private Node head;
    private Node tail;

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list
     * Make The list be able to point backwards. Update the previous node everytime you add a new node.
     */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node; //The first node will become the head.
        } else {
            this.tail.setNext(node); //point to a new node after the current tail.
        }
        this.tail = node;
    } // method add

    // overload method add to add a node by value
    public void add(String value) {
        add(new Node(value)); //this passes a plain string to use as a new value.
    } // method add
/*Count and return the number of nodes in the list. Return the number of nodes*/
    public int getSize() {
        int count = 0; //Start at 0.
        Node current = head; //Go through the list adding 1 for each new node in the list.
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;                   // Return the total correct count.
    }
    public int indexOf(String value) {
        int position = 0;
        int result   = NOT_FOUND;
        Node current = head;

        while (current != null && result == NOT_FOUND) {
            boolean equal;
            if (value == null) {
                equal = current.getValue() == null;
            } else {
                equal = value.equals(current.getValue());
            }
            if (equal) {
                result = position;
            }
            current = current.getNext();
            position++;
        }
        return result;                  // one return
    }
    // implement the comparable interface
    public int compareTo(DoubleLinkedList other) {

    } // method compareTo
} // class DoubleLinkedList
