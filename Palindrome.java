package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String value = "madam";
		
		String rev = "";
		
		int len = value.length();
		
		for (int i = len - 1; i >=0; --i) {
			
			rev = rev + value.charAt(i);  	
						
		}
			
			if (value.equals(rev))
			{
				System.out.println(value+ "Palindrome");
			}
			else
			{
				System.out.println(value+ "Not Palindrome");
			}
		}
			
			}
		

	


