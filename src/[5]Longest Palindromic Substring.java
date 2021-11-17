class BestSolution{
    public static void main(String[] args) {
        String ans;
        ans = longestPalindrome("babad");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("cbbd");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("a");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("acbcabacd");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("bababab");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("cccccc");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("aacabdkacaa");
        System.out.println("ANS: " + ans);
    }

    public static String longestPalindrome(String s) {
        String maxPalindromicString = "";
        String str = insertChar(s);
        return maxPalindromicString.replace("$", "");
    }

    private static String insertChar(String source) {
        StringBuilder target = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            target.append("$").append(ch);
        }
        target.append("$");
        return target.toString();
    }
}

class Solution {
    public static void main(String[] args) {
        String ans;
        ans = longestPalindrome("babad");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("cbbd");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("a");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("acbcabacd");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("bababab");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("cccccc");
        System.out.println("ANS: " + ans);
        ans = longestPalindrome("aacabdkacaa");
        System.out.println("ANS: " + ans);
    }

    public static String longestPalindrome(String s) {
        String maxPalindromicString = "";
        String str = insertChar(s);
        int maxR = str.length() / 2 + 1;
        for (int i = 1; i < str.length() - 1; i++) {
            StringBuilder palindromicString = new StringBuilder(String.valueOf(str.charAt(i)));
            for (int r = 1; r < maxR; r++) {
                if (i - r > 0 && i + r < str.length()
                        && str.charAt(i - r) == str.charAt(i + r)) {
                    palindromicString = new StringBuilder(str.charAt(i - r) + palindromicString.toString() + str.charAt(i + r));
                } else {
                    break;
                }
            }
            if (palindromicString.toString().length() > maxPalindromicString.length()) {
                maxPalindromicString = palindromicString.toString();
            }
        }
        return maxPalindromicString.replace("$", "");
    }

    private static String insertChar(String source) {
        StringBuilder target = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            target.append("$").append(ch);
        }
        target.append("$");
        return target.toString();
    }
}
