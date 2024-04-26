public class Spearate_no_up_lc_spechar {
    public static void main(String[] args) {
        String s = "sa@n*hie63LO85@$52";
        String no = "";
        String up = "";
        String lc = "";
        String sp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 48) && (ch <= 57)) {
                no = no + ch;
            }
            else if ((ch >= 65) && (ch <= 90)) {
                up = up + ch;
            }
            else if ((ch >= 97) && (ch <= 122)) {
                lc = lc + ch;
            }
            else {
                sp = sp + ch;

            }
        }
        System.out.println("special characters:." + sp);
        System.out.println("lower case letters:" + lc);
        System.out.println("upper case letters:" + up);
        System.out.println("numbers are:" + no);
    }
}
