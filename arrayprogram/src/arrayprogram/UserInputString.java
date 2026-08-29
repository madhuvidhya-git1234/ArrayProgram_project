package arrayprogram;
import java.util.Arrays;
import java.util.Scanner;

public class UserInputString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of the arraystring");
		int size=sc.nextInt();
		String []a=new String[size];
		
		for(int i=0;i<=a.length-1;i++) {
			sc.nextLine();
			System.out.println(" Enter the elements to the array"+(i+1));
			a[i]=sc.nextLine();
			System.out.println(Arrays.toString(a));
		}
		
		
	}

}
