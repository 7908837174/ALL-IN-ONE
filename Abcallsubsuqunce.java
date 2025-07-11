
import java.util.*;

class Main {

    public static void main(String[] args) {
        String str = "abcde";
        ArrayList<String> ans = get_Subsequence(str);
        System.out.println(ans);
    }

    public static ArrayList<String> get_Subsequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        char ch = str.charAt(0);
        String rem_String = str.substring(1);
        ArrayList<String> rem_Subsequence = get_Subsequence(rem_String);
        for (String s : rem_Subsequence) {
            myAns.add(s);
            myAns.add(ch + s);
        }
        return myAns;
    }
}
