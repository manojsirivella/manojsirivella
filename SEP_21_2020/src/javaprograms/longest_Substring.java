package javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class longest_Substring {

	public static void main(String[] args) { 
	
		//length of longestsubstring("abbac");
	 lenthoflongestsubstring("abbac");
		
	}
	 public static void lenthoflongestsubstring(String s)
	 {
		 String longestsubstring =null;
		 
		 int LongestSubstringlenth=0;
		 Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		 char[] arr=s.toCharArray();
		 for(int i=0;i<arr.length;i++)
		 {
			 char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>LongestSubstringlenth)
			{
				LongestSubstringlenth=map.size();
			longestsubstring=map.keySet().toString();
			}
		 }
   System.out.println(LongestSubstringlenth);
   System.out.println(longestsubstring);
	}

}


