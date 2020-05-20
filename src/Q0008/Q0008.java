package Q0008;

public class Q0008 {
    public static void main(String[] args) {
        String input = "00123a8";
        System.out.println(myAtoi(input));
    }

    public static int myAtoi(String str) {
        try {
            str = str.trim();
            if (str.length() == 0) return 0;
            while (str.indexOf('+') != str.lastIndexOf('+')) {
                str = str.substring(0, str.lastIndexOf('+'));
            }
            while (str.indexOf('-') != str.lastIndexOf('-')) {
                str = str.substring(0, str.lastIndexOf('-'));
            }
            if (!Character.isDigit(str.charAt(0)) &&
                    str.charAt(0) != '-' && str.charAt(0) != '+') {
                return 0;
            }
            if ((str.charAt(0) == '-' || str.charAt(0) == '+') && str.length() == 1) return 0;
            if (str.indexOf('+') >= 0 && str.indexOf('-') >= 0) {
                if (str.indexOf('-') > str.indexOf('+')) {
                    str = str.substring(0, str.indexOf('-'));
                } else {
                    str = str.substring(0, str.indexOf('+'));
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) != '-' && str.charAt(i) != '+') && !Character.isDigit(str.charAt(i))) {
                    str = str.substring(0, i + 1);
                    break;

                }
            }
            str = str.replaceAll("[^\\d-.]", "");
            if (str.length() == 0) return 0;
            if ((str.charAt(0) == '-' || str.charAt(0) == '+') && str.length() == 1) return 0;
            if (str.indexOf('-') > 0) str = str.substring(0, str.indexOf('-'));
            int answer = (int) Double.parseDouble(str);
            return answer;
        } catch (Exception e) {
            if (str.charAt(0) == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }
}