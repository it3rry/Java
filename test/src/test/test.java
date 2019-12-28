package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @title: test
 * @projectName: test
 * @description: 实现set
 * @author: Terry
 * @date: 2019/9/210:41
 */
public class test {
    public static void main(String[] args) {
        int[] aa = new int[4];
        aa[0] = 2;
        aa[1] = 7;
        aa[2] = 11;
        aa[3] = 15;
        int bb = 9;
        int[] te = new int[2];
        te[0] = 3;
        te[1] = 3;

        int[] ss = new int[2];
        ss = twoSum(te,bb);
        System.out.println(ss[0]);
        System.out.println(ss[1]);
    }

    int[] res =new int[2];
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0;i < nums.length; i++){
            for(int j = 0;j< nums.length;j++){
                if(nums[i] + nums[j] == target){
                    if(i != j){
                        if(i < j){
                            res[0] = i;
                            res[1] = j;
                        }
                        else {
                            res[0] = j;
                            res[1] = i;
                        }
                    }

                }
            }
        }
        return res;
    }
}
