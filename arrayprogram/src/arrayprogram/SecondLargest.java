package arrayprogram;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of an array");
		int size =sc.nextInt();
		int [] a=new int [size];
		int l=a[0];
		int s=a[0];
		for( int i=1;i<a.length;i++) {
			System.out.println(" Enter the value is:"+(i+1));
			a[i]=sc.nextInt();
			if( a[i]>l) {
				s=l;
				l=a[i];
				
			}
			else if(a[i]>s&&a[i]!=l ) {
				s=a[i];
			}
				
			}
		System.out.println(" second largest:"+s);
		}
		
}
