package package1;
import java.util.Scanner;

public class PreWorkAssignment {
	Scanner sc=new Scanner(System.in);
	public void checkPalindrome() {
		int temp,num,rev=0,r;
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		r=num;
		while(num>0) {
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;						
		}
		if(r==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}	
	public void printPattern() {
		int n;
		System.out.println("Enter the no.of rows for printing stars");
		n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void checkPrimeNumber() {
		int num,count=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		if (num==1||num==2) {
			System.out.println("Prime Number");
		}
		else {
		for(int i=3;i<num-1;i++) {
			if((num%i)== 0)
					count++;
			else
				continue;
		}
		if(count>0)
			System.out.println("Not a Prime Number");
		else
			System.out.println("Prime Number");
			
	}
	}
	public void printFibonacciSeries() {
		int n1=0,n2=1,n,sum;
		System.out.println("Enter the number till which the series need to be printed");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=n1+n2;
			System.out.print(sum);
			System.out.print(" ");
			n1=n2;
			n2=sum;
		}
	}
	
	public static void main(String[] args) {
		PreWorkAssignment obj=new PreWorkAssignment();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println();
		System.out.println("Enter your choice from below list.\n" + 
		"1.Find Palindrome of number.\n" + 
		"2.Print pattern for a given number.\n" +
		"3.Check whether the number is a prime number.\n" + 
		"4.Print Fibonacci series.\n" + "---> Enter 0 to exit.\n ");
		System.out.println();
		
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 0:
			choice=0;
			break;
		case 1:
			obj.checkPalindrome();
			break;
		case 2:
			obj.printPattern();
			break;
		case 3:
			obj.checkPrimeNumber();
			break;
		case 4:
			obj.printFibonacciSeries();
			break;
		
		default:
			System.out.println("Invalid choice.Enter a valid number.\n");
		}
		}while(choice!=0); 
		
		System.out.println("Exited Successfully.");
		sc.close();
		
		}
		
	}


