package HashMap;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class LargestKey {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        Map<Integer, String> re = new HashMap<Integer, String>();
	        int n = sc.nextInt();
	        for(int i=0; i<n; i++)
	        	re.put(sc.nextInt(), sc.next());
	        String r=Main_Largest_Key.getstring(re);
	        System.out.println(r);
		}

	
	}

