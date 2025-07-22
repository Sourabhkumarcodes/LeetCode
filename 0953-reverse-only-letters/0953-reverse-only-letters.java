class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int beg = 0;
        int end = s.length() - 1;

        while (beg < end) {
            if (!Character.isLetter(sb.charAt(beg))) {
                beg++;
            } else if (!Character.isLetter(sb.charAt(end))) {
                end--;
            } else {
                char temp = sb.charAt(beg);
                sb.setCharAt(beg, sb.charAt(end));
                sb.setCharAt(end, temp);
                beg++;
                end--;
            }
        }

        return sb.toString();
    }
}