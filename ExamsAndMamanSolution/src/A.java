public class A
{
    private int _n;
    private char _ch;
    public A() { _n = 2; _ch = 'X'; }
    public A(int n) { _n = n; _ch = 'Y'; }
    public A(int n, char ch) { _n = n; _ch = ch; }
    public A(A other) { _n = other._n; _ch = other._ch;}
    public int getN() { return _n; }
    public char getCh() { return _ch; }
    public void inc() { _n++; _ch++; }
    public String toString()
    {
        String s = "";
        for (int i=0; i<_n; i++)
            s+= _ch;
        return s;
    }
}