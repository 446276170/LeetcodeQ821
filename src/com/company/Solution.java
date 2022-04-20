package com.company;

class Solution {
    //    821. 字符的最短距离
//    https://leetcode-cn.com/problems/shortest-distance-to-a-character/
//    官方解答
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }

    public int[] test(String s, char c) {
        int k = s.length();
        int[] a = new int[k];
//        左遍历
        for (int i = 0, im = -k; i < k; i++) {
            if (s.charAt(i) == c) {
                im = i;
            }
            a[i] = i - im;
        }
//        右遍历
        for (int i = k - 1, im = 2 * k; i >= 0; i--) { // 默认值取2k防止取最小值时出错
            if (s.charAt(i) == c) {
                im = i;
            }
            a[i] = Math.min(a[i], im - i);
        }

        return a;
    }
}
