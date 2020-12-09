import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x;
		int n1;
		int n2;
		int n3;
		System.out.println("Enter a choice");
		System.out.println("1.Single parameter (incrementing)");
		System.out.println("2.two parameters (arithmetic addition of two numbers)");
		System.out.println("3.n parameters (summation of n elements");
		x=input.nextInt();
		overload ob=new overload();
		if(x==1)
		{
			System.out.println("Enter a number");
			n1=input.nextInt();
			ob.add(n1);
		}
		else if(x==2)
		{
			System.out.println("Enter 2 numbers");
			n1=input.nextInt();
			n2=input.nextInt();
			ob.add(n1,n2);
		}
		else if(x==3)
		{
			ob.add();
		}
		else
			System.out.println("Invalid");
	}

}
