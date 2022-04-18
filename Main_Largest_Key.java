package HashMap;


import java.util.Map;
import java.util.Set;

public class Main_Largest_Key {
	public static String getstring(Map<Integer, String> re)
	{
		int m = 0;
		 String r=" ";
		 Set<Integer> key=re.keySet();
		 for(Integer l :key)
		 {
			 if(l>m)
			 {
				 m=l;
				 r=re.get(l);
			 }
		 }
		 return r;
	}
}