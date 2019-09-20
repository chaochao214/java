package com.twc.java.Arrays2;

import java.util.Arrays;

public class _01Demo {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 3, 1};

        System.out.println(isEverywhere(a, 2));
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    public int centeredAverage(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }
        return sum / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) sum += nums[i];

            if (nums[i] == 13) i++;
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) sum += nums[i];
            if (nums[i] == 6) {
                while (nums[i] != 7) {
                    i++;
                }
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }


        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        }
        return false;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] == 1 || nums[i] == 4)) {
                return false;
            }
        }
        return true;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count4++;
            } else if (nums[i] == 1) {
                count1++;
            }
        }
        if (count1 == count4) {
            return true;
        }
        return false;
    }

    public int[] fizzArray(int n) {
        int[] a = new int[n - 1];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    public String[] fizzArray2(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + "";
        }
        return a;
    }

    public boolean no14(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                a = 1;
            }
            if (nums[i] == 4) {
                b = 1;
            }
        }
        if (a == 1 && b == 1) {
            return false;
        }
        return true;
    }

    /**
     * isEverywhere([1, 2, 1, 3], 1) → true
     * isEverywhere([1, 2, 1, 3], 2) → false
     * isEverywhere([1, 2, 1, 3, 4], 1) → false
     *
     * @param nums
     * @param val
     * @return
     */
    public static boolean isEverywhere(int[] nums, int val) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                flag = true;
                continue;
            }
            if (nums[i] != val) {
                if (flag == false) {
                    return false;
                }
                flag = false;
            }

        }
        return true;

    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
     * <p>
     * <p>
     * either24([1, 2, 2]) → true
     * either24([4, 4, 1]) → true
     * either24([4, 4, 1, 2, 2]) → false
     *
     * @param nums
     * @return
     */
    public boolean either24(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 2 && nums[i - 1] != 4 && nums[i + 2] != 4) {
                    ;
                    return true;
                }

            }
        }
        return true;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        String s = nums1.toString();
        int count=0;
        for (int i = 0; i < nums2.length; i++) {
            if(s.contains(nums2[i]+"")){
               count++;
            }
        }
        return count;

    }

}