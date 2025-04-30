public class Solution {
    public static boolean solution(String s) {
        int len = s.length();

        // 길이가 4 또는 6이 아니면 false
        if (len != 4 && len != 6) {
            return false;
        }

        // 문자열이 숫자로만 구성되어 있는지 확인
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}