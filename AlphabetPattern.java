package DSA;

import java.util.Scanner;

public class AlphabetPattern {
	
	static int n=7;
	
	public static void printa() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||j==0 || j==n-1 || i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printb() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==n/2 || i==n-1 || j==n-1 && i>n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printc() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printd() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j==n-1 || i==n-1&& j==n-1) {
					System.out.print(" ");
				}
				else if(i==0 || i==n-1 || j==0|| j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printe() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0 || j==0 || i==n/2 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printf() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0 || j==0 || i==n/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printg() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1|| j==n-1 && i>=n/2 || i==n/2 && j>=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printh() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (j==0 || j==n-1 || i==n/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printi() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0 || i==n-1 || j==n/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printj() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0 || j==n/2 || i==n-1&&j<n/2 || j==0 && i>n/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printk() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (j==0 || j==n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++) {
				if (j==0 || j==n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printl() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==n-1 || j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void printm() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j && i<n/2 || i+j==n-1 && i<n/2 || j==n-1 && i>n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void printn() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printo() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 ||i==n-1 ||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printp() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n/2 || j==n-1 && i<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printq() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2 || j==n-1 ||j==0 && i<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printr() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n/2 || j==n-1 && i<n/2 || i-j==n/2 && i>n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void prints() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i==n/2 || j==n-1 && i>n/2 || j==0 && i<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void printt() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printu() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1 && i>n/2 || j==0 ||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printv() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==i && i<n/2|| j==n-i-1 && i<n/2 || j==n/2 && i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printw() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j && i>n/2 || i+j==n-1 && i>n/2 || j==n-1 && i>n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printx() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printy() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==i && i<n/2|| j==n-i-1 && i<n/2 || j==n/2 && i>n/2 || j==n/2 && i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printz() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i+j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);		
		
		while(true) {
			System.out.println("Enter the Character you want to print");
			char c=s.next().charAt(0);
			
			switch(c) {
			case 'a':
				printa();
				break;
			case 'b':
				printb();
				break;
			case 'c':
				printc();
				break;
			case 'd':
				printd();
				break;
			case 'e':
				printe();
				break;
			case 'f':
				printf();
				break;
			case 'g':
				printg();
				break;
			case 'h':
				printh();
				break;
			case 'i':
				printi();
				break;
			case 'j':
				printj();
				break;
			case 'k':
				printk();
				break;
			case 'l':
				printl();
				break;
			case 'm':
				printm();
				break;
			case 'n':
				printn();
				break;
			case 'o':
				printo();
				break;
			case 'p':
				printp();
				break;
			case 'q':
				printq();
				break;
			case 'r':
				printr();
				break;
			case 's':
				prints();
				break;
			case 't':
				printt();
				break;
			case 'u':
				printu();
				break;
			case 'v':
				printv();
				break;
			case 'w':
				printw();
				break;
			case 'x':
				printx();
				break;
			case 'y':
				printy();
				break;
			case 'z':
				printz();
				break;
			default:
				System.out.println("Invalid input....");
		}
			System.out.println("Do you want to coninue : press y :");
			char ch=s.next().charAt(0);
			if(ch != 'y') {
				break;
			}
		}
	}
}
