/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.*;

public class Two_Sum {
	/*
	 * iterative method with n^2 time complexity
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i<nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    int a[];
                    a = new int[2];
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return null;
	
	}
	
	/*
	 * Another way we can do this is by using hashmap
	 * here we will store all the key in hashmap according to the number's value
	 * next we run for loop and substracting each element from the target
	 * the value we get after substraction, we will use it to compare it to the hashmap key
	 * if matched then current i in for loop and i-value of the hasmap will be j
	 */
	
	public int[] twoSum_Hash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++)
        {
            
            int j = target- nums[i];
            if (map.containsKey(j))
            {
                int x = map.get(j);
                int a[] = {x,i};
                return a;
            }
            map.put(nums[i], i);
            
        }
        return null;
    }

}
