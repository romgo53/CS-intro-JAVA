public class Q3 {
    public static int f(Node root)
    {
        if(root ==null)
            return 0;
        int left = f(root.getLeftSon());
        int right = f(root.getRightSon());
        return 1+ (left>right ? left : right);
    }

    public static boolean secret(Node root)
    {
        if(root ==null)
            return true;
        int a = f(root.getLeftSon());
        int b = f(root.getRightSon());
        return Math.abs(a-b)<=1 &&
                secret(root.getLeftSon()) &&
                secret(root.getRightSon());
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.setLeftSon(new Node(2));
        root.setRightSon(new Node(3));
        root.getRightSon().setRightSon(new Node(10));
        root.getRightSon().setLeftSon(new Node(11));
//        root.getRightSon().getRightSon().getRightSon().setRightSon(new Node(12));
        root.getRightSon().getRightSon().setRightSon(new Node(12));
        root.getLeftSon().setLeftSon(new Node(4));
        root.getLeftSon().setRightSon(new Node(5));
        root.getLeftSon().getLeftSon().setLeftSon(new Node(6));
        root.getLeftSon().getRightSon().setLeftSon(new Node(7));
        root.getLeftSon().getRightSon().setRightSon(new Node(8));
        root.getLeftSon().getRightSon().getLeftSon().setRightSon(new Node(9));
        System.out.println(f(root));
        System.out.println(secret(root));
    }
}
