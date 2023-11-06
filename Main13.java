// Write a program to add all the elements in the array given by users 
//and also take index from user.
import java.util.Arrays;
import java.util.Scanner;
public class Main13 {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         int x = sc.nextInt();
         
         int[] a = new int[x];
         int sum = 0;
         for(int i=0; i<a.length; i++) {
        	a[i]=sc.nextInt();
        	 sum = sum+a[i];
         }
         System.out.println(Arrays.toString(a));
         System.out.println("The sum is " + sum);
	}
	

}
