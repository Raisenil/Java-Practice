import java.util.Scanner;
public class overload {
	void add(int a) {
		int sum;
		sum=a;
		for(int i=1;i<=a;i++) {
			sum=sum+1;
		}
		System.out.println("Addition "+sum);
	}
	
	void add(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println("Addition "+sum);
	}
	void add() {
		int n,n4;
		System.out.println("Enter the number of peramiters");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter number");
			n4=input.nextInt();
			sum=sum+n4;
		}
		System.out.println("Addition "+sum);
	}

}
