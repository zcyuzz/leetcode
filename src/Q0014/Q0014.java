package Q0014;

/*

 */
public class Q0014 {
    public static void main(String[] args) {
        String[] input = {"abc", "abca"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String answer = "";
        int shortest = Integer.MAX_VALUE;
        boolean CP = true;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest) {
                shortest = strs[i].length();
            }
        }
        for (int i = 0; i < shortest; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    return answer;
                }
            }
            answer += strs[0].charAt(i);
        }
        return answer;
    }
}

