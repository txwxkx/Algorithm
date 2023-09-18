class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strAB = strA + strB;
        String strBA = strB + strA;
        int intAB = Integer.valueOf(strAB);
        int intBA = Integer.valueOf(strBA);
        
        if (intAB >= intBA) {
            answer = intAB;
        } else {
            answer = intBA;
        }
        
        
        return answer;
    }
}