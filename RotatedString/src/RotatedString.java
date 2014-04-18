
public class RotatedString {

	public static void main(String[] args) 
	{
		System.out.println(isSubstring("goodg", "oodgg"));

	}
	
	public static boolean isSubstring(String s1,String s2)
	{
		int length = s1.length();
		
		if(length == s2.length() && length>0)
		{
			//String s = s1 + s2;
			if((s1 + s2).contains(s2))
				return true;
		}
		
		return false;
	}

}
