class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strAB = String.valueOf(a) + String.valueOf(b);
        int AB = Integer.valueOf(strAB);
        int ab2 = 2 * a * b; 
        
        if (AB >= ab2) {
            answer = AB; 
        } else {
            answer = ab2;
        }
        
        return answer;
    }
}