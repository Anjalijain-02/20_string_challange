import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string= sc.next();
		int start=0;
		int end= string.length()-1;
		int p=0;
		while(start<end)
		{
		    
		        if(string.charAt(start)!=string.charAt(end))
		        {
		           p=1;
		            
		        }
		        
		   start++;
		   end--;
		}
		
		if(p==1)
		{
		 System.out.print("not palindrome");
		}
		 else
		 {
		System.out.print("palindrome");
		 }
	}
}
