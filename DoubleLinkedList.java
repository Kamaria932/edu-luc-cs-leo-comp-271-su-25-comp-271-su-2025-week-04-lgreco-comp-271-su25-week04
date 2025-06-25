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
    /*
     * Write an indexOf method in DoubleLinkedList and return –1 if not found. 
     */
    public int indexOf(String value) {
        int position = 0; //zero-based index.
        int result   = NOT_FOUND;
        Node current = head; 

        while (current != null && result == NOT_FOUND) { //The loop will run as long as there are no more nodes left and there is no match found.
            boolean equal;
            if (value == null) { //Checks for null.
                equal = current.getValue() == null; //This will be true only if the node value is also null.
            } else {
                equal = value.equals(current.getValue());
            }
            if (equal) {
                result = position; //store the position on the current node that was found.
            }
            current = current.getNext(); //Move to the next node.
            position++;
        }
        return result;                  //return the index-based value result.
    }
    /*true if the list contain value and if not set it to false.
     * Boolean contains method.
    */
     public boolean contains(String value) {
        return indexOf(value) != NOT_FOUND;
    }
/* */
    // implement the comparable interface
    public int compareTo(DoubleLinkedList other) {
            int diff = 0;  // assume they are equal
            if (other != null) {  // Check if other is null. If it is do not touch.
                diff = this.getSize() - other.getSize(); //Difference in total node counts.
        }
        return diff;
    }
 public String toString() {
        return "DoubleLinkedList(size=" + getSize() + ")";
        }
    } // method compareTo
} // class DoubleLinkedList
