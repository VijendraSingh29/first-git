import java.util.HashSet;

public class allPermutations {

    // https://leetcode.com/problems/letter-tile-possibilities/

    public static void main(String[] args) {
        String s = "AAAB";
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        allPermutations p = new allPermutations();

        p.allpermu(s, 0, 1, sb, set);
        System.out.println(set.size()); //total number of possibility
    }

    public static void allpermu(String s, int start, int k, StringBuilder sb, HashSet<String> set) {
        if (sb.length() > 0) {  // for each possibility of sequence ,length of 1,2,... n.
            if (!set.contains(sb.toString())) {
                System.out.println(sb.toString());
                set.add(sb.toString());
            }
        }
        if (start == s.length())
            return;
        for (int i = start; i < s.length(); i++) {
            s = swap(s, i, start);
            sb.append(s.charAt(start));
            allpermu(s, start + 1, k, sb, set);
            //backtracking
            sb.deleteCharAt(sb.length() - 1);
            s = swap(s, i, start);
        }


    }

    private static String swap(String s, int i, int j) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
