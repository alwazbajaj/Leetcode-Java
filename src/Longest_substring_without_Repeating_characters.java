import java.util.*;

public class Longest_substring_without_Repeating_characters {
	

        
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
        
    }


