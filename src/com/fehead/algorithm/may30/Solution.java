package com.fehead.algorithm.may30;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nightnessss 2020/3/30 21:14
 */
class Solution {
    public int lastRemaining(int n, int m) {

        CircularLinkedList<Integer> linkedList = new CircularLinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        while(linkedList.size() > 1) {
            for (int i = 0; i < m; i++) {
                linkedList.next();
            }
            linkedList.remove();
        }
        return linkedList.get(0);
    }

    public int lastRemaining2(int n, int m) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int p = m;
        while (list.size() > 1) {
            while (p > list.size()) {
                p -= list.size();
            }
            list.remove(p-1);
            p = m+p-1;
        }
        return list.get(0);
    }

}
