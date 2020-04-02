package com.fehead.algorithm.april01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nightnessss 2020/4/2 0:32
 */
public class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int[] res = new int[seq.length()];

        int d = 0;
        int i = 0;
        char[] chars = seq.toCharArray();
        for (char c : chars) {

            if (c == '(') {
                d += 1;
                res[i++] = d % 2;

            }
            if (c == ')') {
                res[i++] = d % 2;
                d -= 1;
            }
        }

        return res;
    }
}
