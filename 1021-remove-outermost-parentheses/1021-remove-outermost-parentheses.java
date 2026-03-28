class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (count > 0) {
                    str.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}