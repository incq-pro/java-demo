package pro.incq.lang.time;

import java.util.LinkedList;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-02-09
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int[] hash = new int[128];
        while(right < n) {
            char c = s.charAt(right);
            while (hash[c] != 0) {
                hash[s.charAt(left)]--;
                left++;
            }
            hash[c]++;
            right++;
        }
        return right - left;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = s.longestSubarray(new int[]{8,2,4,7}, 4);
        System.out.println(n);
    }

    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int maxLen = 0;
        LinkedList<Integer> maxQ = new LinkedList<>();
        LinkedList<Integer> minQ = new LinkedList<>();
        int left = 0;
        int right = 0;
        while(right < n) {
            int v = nums[right];
            while(!maxQ.isEmpty() && nums[maxQ.getLast()] <= v) {
                maxQ.removeLast();
            }
            maxQ.add(right);
            while(!minQ.isEmpty() && nums[minQ.getLast()] >= v) {
                minQ.removeLast();
            }
            minQ.add(right);
            while(Math.abs(nums[maxQ.getFirst()] - nums[minQ.getFirst()]) > limit) {
                left++;
                while (maxQ.getFirst() < left) {
                    maxQ.removeFirst();
                }
                while (minQ.getFirst() < left) {
                    minQ.removeFirst();
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }



}
