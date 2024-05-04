import java.util.Arrays;

public class Spearate_no_up_lc_spechar {
    public static void main(String[] args) {
        String s = "A1bc23D@e4!";
        String num = "";
        String Low = "";
        String Up = "";
        String sp = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 48) && (ch <= 57)) {
                num += ch;
            } else if ((ch >= 97) && (ch <= 122)) {
                Low += ch;
            } else if ((ch >= 65) && (ch <= 90)) {
                Up += ch;
            } else {
                sp += ch;
            }
        }
        System.out.println(num);
        System.out.println(Low);
        System.out.println(Up);
        System.out.println(sp);

        for (int j = 0; j < num.length(); j++) {
            //int digit =Integer.parseInt(String.valueOf(num.charAt(j)));
            // or
            //    int digit = Character.getNumericValue(num.charAt(j));
            //or
            int l = num.charAt(j) - '0';
            sum +=l;
           // sum += digit;
        }
        System.out.println(sum);

        String s1= "Bengaluru love I";
        char[] charArray = s1.toCharArray();
        String upperCase = String.valueOf(charArray[10]).toUpperCase();



    }
}