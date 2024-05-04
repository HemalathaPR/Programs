public class Rev_Sentence {
    public static void main(String[] args) {
            String s = "Bengaluru love I";
            int a=6;
            String[] w = s.split(" ");
            String h ="";

            for(int i=w.length-1;i>=0;i--){
                System.out.print(w[i]+" ");
            }
        for (int i = s.length()-1; i >=0 ; i--) { //this is for reversing string
            h+=s.charAt(i);
        }
        System.out.println(h);
        char c= (char)(a +'0');
        System.out.println(c);
    }
}
