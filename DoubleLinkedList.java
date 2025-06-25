public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;
    private static final int Not_Found = -1; //Try to avoid the magic numbers.

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
    }
    } // method add

    // overload method add to add a node by value
    public void add(String value) {
    } // method add

    // implement the comparable interface
    public int compareTo(nfs_DoubleLinkedList other) {
        return -1234567;
    } // method compareTo
} // class DoubleLinkedList
