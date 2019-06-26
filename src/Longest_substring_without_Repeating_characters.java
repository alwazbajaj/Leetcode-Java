/*Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/



import java.util.*;

public class Longest_substring_without_Repeating_characters {
	

        // o(n2)
		public int lengthOfLongestSubstring(String s) {
	        
	        int res = 0 ;
	        HashMap<Character, Integer> map = new HashMap<>();
	        int max = 0;
	        for (int j =0; j < s.length(); j++)
	        {
	        max = 0;
	        map.clear();
	        for (int i =j; i < s.length(); i++)
	        {
	            if (map.containsKey(s.charAt(i)))
	            {
	                if (res < max)
	                {
	                   res = max; 
	                }
	            	break;
	            }
	            else
	            {
	            	map.put(s.charAt(i), 1);
	            	max++;
	            }
	        }
	        if (res < max)
	        {
	            res = max;
	        }
	    }
	        return res;   
	    }
		
		// O (n)
		public int FastLongestSubString(String S) {
			int res = 0;
			int cur = 0;
			int start = 0;
			HashMap <Character, Integer> map = new HashMap <>();
			for (int i =0 ; i < S.length(); i++) {
				if (!map.containsKey(S.charAt(i)))
				{
					map.put(S.charAt(i), i);
					cur++;
				}
				else
				{
					int prev = map.get(S.charAt(i));
					start = Math.max(prev+1, start);
					cur = i - start + 1;
					map.put(S.charAt(i), i);
				}
				if (res < cur)
				{
					res = cur;
				}
			return res;
			}
			return res;
			
		}
        
    }




