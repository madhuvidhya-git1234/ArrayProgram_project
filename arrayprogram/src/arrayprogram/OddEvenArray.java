package arrayprogram;
import java.util.Scanner;
public class OddEvenArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print( " Enter the size of an array");
		int size=sc.nextInt();
		int [] a= new int[size];
		int oddcount=0;
		int evencount=0;
		for ( int i=0;i<a.length;i++) {
			System.out.print(" Enter the value:"+ (i+1));
			a[i]=sc.nextInt();
							if( a[i]%2==0) {
					evencount++;
				}
				else {
					oddcount++;
				}
			}	
				
			
		System.out.print( " even number count:"+evencount);
		System.out.print(" odd number count:"+oddcount);
		
		}
	}


