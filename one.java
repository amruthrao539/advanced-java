package corejava;
//Greatest among 3 numbers
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("a is greatest");
		else
			if(b>c && a>c)
				System.out.println("b is greatnest");
			else
				System.out.println("c is greatest");
	}

}