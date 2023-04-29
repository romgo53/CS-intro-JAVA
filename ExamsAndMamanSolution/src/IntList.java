public class IntList {
    private IntNode _head;
    public IntList(){ _head = null; }
    public IntList(IntNode node){ _head = node; }

    public int something(){
        int temp=1;
        int cnt=1;
        IntNode p =_head, q=p;
        p=p.getNext();
        while(p!=null){
            if(p.getValue()*q.getValue() < 0){
                cnt++;
                temp = Math.max(cnt,temp);
            } else cnt = 1;
            q=p;
            p=p.getNext();
        }
        return temp;
    }
    public static void what(Node root)
    {
        if (root == null)
            return;
        what(root.getLeftSon(), root.getRightSon(), 1);
    }
    private static void what(Node root1, Node root2, int level)
    {
        if (root1 == null || root2 == null)
            return;
        what(root1.getLeftSon(), root2.getRightSon(), level + 1);
        if (level % 2 == 1)
        {
            int temp = root1.getNumber();
            root1.setNumber(root2.getNumber());
            root2.setNumber(temp);
        }
        what(root1.getRightSon(), root2.getLeftSon(), level + 1);
    }

    public static void main(String[] args) {
        IntNode node = new IntNode(2);
        IntNode n1 = new IntNode(-6);
        node.setNext(n1);
        IntNode n2 =  new IntNode(-3);
        n1.setNext(n2);
        IntNode n3 =  new IntNode(4);
        n2.setNext(n3);
        IntNode n4 =  new IntNode(-7);
        n3.setNext(n4);
        IntNode n5 =  new IntNode(4);
        n4.setNext(n5);
        IntNode n6 =  new IntNode(6);
        n5.setNext(n6);
        IntNode n7 =  new IntNode(-1);
        n6.setNext(n7);
        IntNode n8 =  new IntNode(3);
        n7.setNext(n8);

        IntList lst = new IntList(node);
        System.out.println(lst.something());
    }
}
