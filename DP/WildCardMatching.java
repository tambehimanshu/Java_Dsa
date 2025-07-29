class DP {

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[] prev = new boolean[m + 1];
        boolean[] curr = new boolean[m + 1];

        // Empty pattern and empty string match
        prev[0] = true;

        // Only '*' can match with empty string
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                prev[j] = prev[j - 1];
            } else {
                prev[j] = false;
            }
        }

        for (int i = 1; i <= n; i++) {
            curr[0] = false; // non-empty string can't match with empty pattern
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?') {
                    curr[j] = prev[j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    curr[j] = prev[j] || curr[j - 1];
                } else {
                    curr[j] = false;
                }
            }
            boolean[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[m];
    }

    public static void main(String[] args) {
        String pattern = "*abcde";
        String text = "zuvraabcde";

        boolean res = isMatch(text, pattern);
        System.out.println(res); //true
    }
}
