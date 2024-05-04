public class Rev_integer {
    public static void main(String[] args) {
        Integer n = 123;
        Integer rev=0;
        while(n>0){
            int rem=n%10;  //
            rev=rev+rem;
            n=n/10;
        }
        System.out.println(rev);

    }
}
