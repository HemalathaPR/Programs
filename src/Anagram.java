import java.util.Arrays;
/**
@author hemalatha

 */
public class Anagram {
    public static void main(String[] args) {
        String s1 = "Dog";
        String s2 = "God";
        if (s1.length() == s2.length()) {
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
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
        else {
            System.out.println("length is not same so its not anagram");
        }
    }
}
