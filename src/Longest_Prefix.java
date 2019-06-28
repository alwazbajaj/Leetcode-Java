public class Longest_Prefix {
	
	
	
	public static String longestCommonPrefix(String[] strs) {
	        
	        int len = strs.length;
	        char c;
	        String str = new String ();
	        str = "";
	        int min = 999999;
	        if (strs.length == 0)
	        {
	            return "";
	        }
	        for (int i = 0; i < len; i++){
	            if (min > strs[i].length()){
	                min = strs[i].length();
	            }
	            if (strs[i].isEmpty())
	            {
	                return "";
	            }
	        }
	        
	        for (int i =0; i < min; i++){
	        	int j =0;
	            c = strs[j].charAt(i);
	            for ( j =0 ; j < len; j++){
	                if (c != strs[j].charAt(i)){
	                    return str;
	                }
	            }
	            str = str + c;
	                
	            }
	        return str;
	        }
	        
	        }
	
	
	        

        


