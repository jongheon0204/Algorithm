// 프로그래머스 Level1 : 내적
// https://programmers.co.kr/learn/courses/30/lessons/70128
class Solution {
    public int solution(int[] a, int[] b) {
        int ans = 0;
        for(int i=0; i<a.length; i++){
            ans += (a[i] * b[i]);
        }
        return ans;
    }
}