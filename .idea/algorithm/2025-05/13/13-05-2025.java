
class Solution {
    public int solution(int n) {
        String trit = Integer.toString(n,3);
        StringBuffer stringBuffer = new StringBuffer(trit);
        String reverse = stringBuffer.reverse().toString();
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}