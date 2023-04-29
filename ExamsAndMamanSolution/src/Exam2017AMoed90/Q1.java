package Exam2017AMoed90;

public class Q1 {
    public static void main(String[] args) {
        Item it0 = new Item(10,60);
        Item it1 = new Item(20,100);
        Item it2 = new Item(30,120);
        Item it3 = new Item(15,200);
        Item[] it = {it0,it1,it2,it3};
        System.out.println(knapSack(it, 30));
    }
    public static int knapSack(Item[] it, int w){
        return knapSack(it, w, 0, 0);
    }
    private static int knapSack(Item[] it, int w, int i, int sum) {
        if(w<0)
            return Integer.MIN_VALUE;
        if(i == it.length || w == 0)
            return sum;
        return Math.max(knapSack(it,w-it[i].getWeight(), i+1, sum+it[i].getValue()),knapSack(it,w, i+1, sum));
    }
}
