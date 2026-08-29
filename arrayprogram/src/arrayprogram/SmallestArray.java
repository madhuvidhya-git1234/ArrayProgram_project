package arrayprogram;
import java.util.Scanner;

public class SmallestArray {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter the size of an array");
			int size =sc.nextInt();
			int [] a=new int [size];
			System.out.println("Enter the array: ");
			for (int i=1;i<a.length;i++ ) {
				System.out.println(" Enter the values:"+(i+1));
				a[i]= sc.nextInt();
			}
				int smallest =a[0];
			
				for(int i=1;i<a.length;i++ ) {
					
				if(a[i]< smallest ) {
					smallest=a[i];
				}
			}
			System.out.println(" smallest number :"+smallest);	
				
				
				
				
				
				
				
				
				
			}
	}



