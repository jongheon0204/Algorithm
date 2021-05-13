// 프로그래머스 Level1 : 소수 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12977
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    ans += (IntStream.rangeClosed(2, (int)Math.sqrt(sum))
                            .allMatch(p -> (sum % p) != 0) ? 1 : 0);
                }
            }
        }
        return ans;
    }
}