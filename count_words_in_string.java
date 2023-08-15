import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int space=0;
		if(n.length()==0)
		{
		    System.out.print("0");
		   
		}
		else{
		for(int i=0;i<n.length();i++)
		{
		    if(n.charAt(i)==' ')
		    {
		        space++;
		    }
		}
		System.out.print(space+1);
		}
	}
}
