package Jan23;

import java.util.ArrayList;

public class EX2 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        int[] num3 = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                num1[i] = nums[i];
            } else {
                num2[i] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (num1[i] != 0) {
                list.add(num1[i]);
            } else {
                i++;
            }
            if (num2[i] != 0) {
                list.add(num2[i]);
            } else {
                i++;
            }
        }

    }
}

