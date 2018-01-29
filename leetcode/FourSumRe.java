package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumRe {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 4)
            return res;
        
        int len = nums.length;
        for(int i=0; i<len-3; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<len-2;j++){
                if(j!=i+1 && nums[j] == nums[j-1]) continue;
                int l = j+1;
                int r = len-1;
                while(l<r){
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]); ans.add(nums[j]); ans.add(nums[l]); ans.add(nums[r]);
                        res.add(ans);
                        l++;r--;
                        while(l<r && nums[l] == nums[l-1])l++;
                        while(l<r && nums[r] == nums[r+1])r--;
                    }
                    else if(sum < target)l++;
                    else r--;
                }
            }
        }
        return res;
    }
}
