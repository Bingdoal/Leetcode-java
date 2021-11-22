class BestSolution {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String ans;
        ans = longestPalindrome("bsdxdaba");
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

        System.out.println("Pass time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    public static String longestPalindrome(String s) {
        String str = insertChar(s);
        int[] radius = new int[str.length()];
        int maxR = 1, maxIdx = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (i < maxIdx + radius[maxIdx]) {
                radius[i] = Math.min(radius[maxIdx * 2 - i], maxIdx + radius[maxIdx] - i);
            } else {
                radius[i] = 1;
            }

            while (i - radius[i] >= 0 && i + radius[i] < str.length()
                    && str.charAt(i - radius[i]) == str.charAt(i + radius[i])) {
                radius[i]++;
            }

            if (radius[i] > maxR) {
                maxR = radius[i] - 1;
                maxIdx = i;
            }
        }
        return str.substring(maxIdx - maxR, maxIdx + maxR).replace("$", "");
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
