public class Driver{
    public static void main(String[] args){

        System.out.println("1." );
        A a1 = new A(3, 'C');
        System.out.println(a1);
//
        System.out.println("\n 2.");
        A a2 = new A(5);
        System.out.println(a2);

        System.out.println("\n 3.");
        B b1 = new B(a1);
        a1.inc();
        System.out.println(b1);
        System.out.println(a1);


        System.out.println("\n 4.");
        B b2 = new B(b1, 5);
        System.out.println(b2);


        System.out.println("\n 5.");
        A a3 = new B(4);
        System.out.println(a3);


        System.out.println("\n6.");
        A a4 = b2.makeA();
        System.out.println(a4);

    }
}
