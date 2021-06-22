package pro.incq.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int smallestFactorization(int a) {
        List<Integer>result = new ArrayList<>();
        while(a > 1) {
            boolean found = false;
            for(int i = 9; i >= 2; i--) {
                if ((a % i) == 0) {
                    found = true;
                    a /= i;
                    result.add(i);
                    break;
                }
            }
            if (!found) {
                break;
            }
        }
        System.out.println(a);
        System.out.println(result);
        if (a > 1) {
            return 0;
        }
        long x = 0;
        Collections.sort(result);
        for(int i = 0; i < result.size(); i++) {
            x = (x * 10 + result.get(i));
            if (x > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int)x;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int x = s.smallestFactorization(9765625);
        System.out.println(x);
    }

}
