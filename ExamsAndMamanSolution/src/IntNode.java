public class IntNode {
    private int _value;
    private IntNode _next;

    /**
     * Gets only a value and sets _next to be null
     * @param value The value
     */
    public IntNode(int value) {
        _value = value;
        _next = null;
    }

    /**
     * Gets value and IntNode object
     * @param value The value
     * @param next The next IntNode object in the linked list
     */
    public IntNode(int value, IntNode next) {
        _value = value;
        _next = next;
    }

    /**
     * Copy constructor
     * @param other The other IntNode object.
     */
    public IntNode(IntNode other) {
        _value = other.getValue();
        _next = other.getNext();
    }

    public int getValue() {
        return _value;
    }

    public IntNode getNext() {
        return _next;
    }

    public void setValue(int value) {
        _value = value;
    }

    public void setNext(IntNode next) {
        _next = next;
    }
}
