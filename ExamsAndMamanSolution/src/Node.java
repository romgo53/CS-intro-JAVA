public class Node {
    private int _number;
    private Node _leftSon, _rightSon;

    public Node(int number) {
        _number = number;
        _leftSon = null;
        _rightSon = null;
    }
    public int getNumber() {
        return _number;
    }
    public int getData() { return _number; }
    public Node getLeftSon() {
        return _leftSon;
    }
    public Node getRightSon() {
        return _rightSon;
    }
    public void setNumber(int number) {
        _number = number;
    }
    public void setLeftSon(Node leftSon) {
        _leftSon = leftSon;
    }
    public void setRightSon(Node rightSon) {
        _rightSon = rightSon;
    }
    public static int f(Node root) {
        if (root == null) {
            return 0;
        }
        return f(root.getLeftSon()) + 1 + f(root.getRightSon());
    }
    public static void printPreOrder (Node root)
    {
        if (root != null)
        {
            System.out.print (root.getNumber() + " ");
            printPreOrder(root.getLeftSon());
            printPreOrder(root.getRightSon());
        }
    }
    public static void printInOrder (Node root)
    {
        if (root != null)
        {
            printInOrder(root.getLeftSon());
            System.out.print (root.getNumber() + " ");
            printInOrder(root.getRightSon());
        }
    }

    public static void printPostOrder (Node root)
    {
        if (root != null)
        {
            printPostOrder(root.getLeftSon());
            printPostOrder(root.getRightSon());
            System.out.print (root.getNumber() + " ");
        }
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.setRightSon(new Node(20));
        root.getRightSon().setRightSon(new Node(30));
//        root.getRightSon().getRightSon().setRightSon(new Node(40));
        root.setLeftSon(new Node(5));
////        root.getRightSon().getLeftSon().setRightSon(new Node(23));
//
//        root.getRightSon().setRightSon(new Node(71));
//        root.getRightSon().getRightSon().setRightSon(new Node(70));
//        root.getRightSon().getRightSon().setLeftSon(new Node(60));
//        root.getRightSon().getRightSon().getLeftSon().setLeftSon(new Node(49));
        System.out.println("PreOrder:");
        printPreOrder(root);
        System.out.println();
        System.out.println("InOrder:");
        printInOrder(root);
        System.out.println();
        System.out.println("PostOrder:");
        printPostOrder(root);
    }
}
