public class Swap {
    public static void main(String[] args) {
        int a = 56;
        int b = 85;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
