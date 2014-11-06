public class RotatedString {

	public static void main(String[] args) {
		System.out.println(isSubstring("goodg", "oodgg"));
	}
	
	public static boolean isSubstring(String s1,String s2) {
		int length = s1.length();
		
		return (length == s2.length() && 
		        length > 0 && 
		        (s1 + s2).contains(s2));
	}
}
