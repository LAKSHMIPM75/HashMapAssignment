package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class UserMainCode{
	public static int intsizeOfResultandHashMap(HashMap<Integer ,String>hm)
	{
		int k,count=0;
		Iterator<Integer>it=hm.keySet().iterator();
		while(it.hasNext())
		{
			k=it.next();
			if(k%4!=0)count++;
			}
		return count;
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		for(int  i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.next());
			}
		System.out.println(UserMainCode.intsizeOfResultandHashMap(hm));
		}
	}

