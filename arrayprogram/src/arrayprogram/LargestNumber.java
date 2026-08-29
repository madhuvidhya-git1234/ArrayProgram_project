
package arrayprogram;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of an array");
		int size =sc.nextInt();
		int [] a=new int [size];
		int largest =a[0];
		
		for (int i=1;i<a.length;i++ ) {
			System.out.println(" Enter the values:"+(i+1));
			a[i]= sc.nextInt();
			if( largest >=a[i]) {
				largest=a[i];
			}
		}
		System.out.println(" smallest number :"+largest);	
			
			
			
			
			
			
			
			
			
		}
}

