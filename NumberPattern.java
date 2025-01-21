package DSA;
import java.util.Scanner;

public class NumberPattern {
	int n=5;
	
	public void print0() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0 || i==n-1 || j==0  || j==n-1 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	  public void print1() {
		
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(j==n/2 || i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print2() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0 || j==n-1 && i<=n/2 || i==n/2 || i==n-1 || j==0 && i>n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print3() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0 || j==n-1 || i==n-1 || i==n/2 && j>=n/4)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print4() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(j==n-1 || i==n/2 || j==0 && i<n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print5() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==n/2 || i==0 || i==n-1 || j==0 && i<n/2 || j==n-1 && i>n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print6() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==n/2 || i==0 || i==n-1 || j==0 || j==n-1 && i>n/2  )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print7() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0 ||j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print8() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==n/2 || i==0 || i==n-1 || j==0 || j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void print9() {
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==n/2 || i==0 || i==n-1 || j==0 && i<n/2 || j==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		NumberPattern p =new NumberPattern();
		
		Scanner s=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("Enter the Number you want to print");
			int num=s.nextInt();
			
			switch(num) {
			case 0:
				p.print0();
				break;
			case 1:
				p.print1();
				break;
			case 3:
				p.print3();
				break;
			case 4:
				p.print4();
				break;
			case 5:
				p.print5();
				break;
			case 6:
				p.print6();
				break;
			case 7:
				p.print7();
				break;
			case 8:
				p.print8();
				break;
			case 9:
				p.print9();
				break;
			default:
				System.out.println("Invalid input....");
		}
			System.out.println("Do you want to coninue : press y :");
			char c=s.next().charAt(0);
			if(c != 'y') {
				break;
			}
		}
	}
}
