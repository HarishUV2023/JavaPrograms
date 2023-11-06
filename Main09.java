import java.util.Scanner;

// take a index from user for our String array and also take input for that array
public class Main09 {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index for String Array");
            int x = sc.nextInt();
            
            String[] s = new String[x];
            
           System.out.println("Enter the data"); 
            for(int i=0; i<s.length ;i++) {
            	System.out.print("s["+ i +"] = ");
            	s[i] = sc.next();
            }
            
            for(int i=0 ;i<s.length;i++) {
            	System.out.print(s[i] + " ");
            }
            
	}

}
