package arrayprogram;
import java.util.Scanner;
public class SumArray{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println( " Enter tha size of an array ");
	int size=sc.nextInt();
	int [] a= new int[size];
	int sum=0;
	for ( int i=0;i<a.length;i++) {
		System.out.println( "the sum of an array :"+(i+1));
		
		a[i]=sc.nextInt();
		sum=sum+a[i];
		
		System.out.println(" th sum is:"+ sum);
	}
		
	}
	
}
