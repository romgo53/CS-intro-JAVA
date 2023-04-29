public class B extends A {
    private A _a;
    public B() { super(); _a = new A(); }
    public B(int n) { super(n); _a = new A(); }
    public B(A other) { super(); _a = new A(other); }
    public B(A other,int n) { super(other); _a = new A(n); }
    public void inc() { _a.inc(); }
    public String toString() { return _a.toString(); }

    private int comp (int n, int m)
    {
        if (n > m)
            return n;
        return m;
    }

    private char comp (char ch1, char ch2)
    {
        if (ch1 < ch2)
            return ch1;
        return ch2;
    }

    public A makeA()
    {
        return new A(comp(_a.getN(), getN()),
                comp(_a.getCh(), getCh()));
    }

}
