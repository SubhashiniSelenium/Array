package CtsDemo;
import java.util.*;
public class Even_or_Odd {
	public static void main(String[] args)
	{	
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		 if(a%2==0)
			System.out.println("Entered" + a + "is Even");
	        else
		System.out.println("Entered" + a + "is Odd");
	}
}
