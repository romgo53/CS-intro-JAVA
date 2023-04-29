
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stack
{
    // integer stack
    private IntNode _top;

    public Stack() {
        _top = null;
    }
    public boolean isEmpty() {
        return _top == null;
    }
    public void push(int value) {
        _top = new IntNode(value, _top);
    }
    public int pop() {
        int value = _top.getValue();
        _top = _top.getNext();
        return value;
    }
    public int top() {
        return _top.getValue();
    }
    public String toString()
    {
        String s = "";
        IntNode temp = _top;
        while (temp != null)
        {
            s += temp.getValue() + "\t";
            temp = temp.getNext();
        }
        return s;
    }

    public static int popMin(Stack s) {
        Stack s1 = new Stack();
        int min = s.top();
        while (!s.isEmpty()) {
            int temp = s.pop();
            if (temp < min) {
                min = temp;
            }
            s1.push(temp);
        }
        boolean firstMin = true;
        while (!s1.isEmpty()) {
            int temp = s1.pop();
            if((temp == min) && firstMin)
                firstMin = false;
            else
                s.push(temp);
        }
        return min;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(1);
        s.push(3);
        s.push(1);
        s.push(5);
        s.push(1);

        System.out.println(s);
        System.out.println(popMin(s));
        System.out.println(s);
    }

}
