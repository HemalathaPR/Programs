
public class Add_arry {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 8, 12, 16, 20, 30};
        int[] b = {3, 8, 9, 1, 10};
        int [] c= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum= a[i];
            if (i<b.length)
            {
                sum+=b[i];
            }
            c[i]+=sum;
        }
        for (int num: c) {
            System.out.println( num + " ");

        }



    }
}
