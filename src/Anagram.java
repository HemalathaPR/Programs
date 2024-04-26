import java.util.Arrays;
/**
@author hemalatha

 */
public class Anagram {
    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "god";
        if (s1.length() == s2.length()) {
            char[] ar1 = s1.toCharArray();
            char[] ar2 = s2.toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            boolean b = Arrays.equals(ar1, ar2);
            if (b) {
                System.out.println("is anagram");
            } else {
                System.out.println("not");
            }

        }
    }
}
