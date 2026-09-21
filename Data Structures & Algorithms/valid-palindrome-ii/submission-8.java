class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {

                int left = l + 1;
                int right = r;

                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right) {
                    return true;
                }

                left = l;
                right = r - 1;

                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                return left >= right;
            }

            l++;
            r--;
        }

        return true;
    }
}