import java.util.Arrays;

public class Main11 {

	public static void main(String[] args) {
          int[]  a = {12,24,36,54};
          System.out.println(Arrays.toString(a));
          
          int[] b = Arrays.copyOf(a, 5);
          b[4] = 23;
          System.out.println(Arrays.toString(b));
          
          int[] c = {60,40,80,10,30,90,100,50,20,70};
          Arrays.sort(c);
          System.out.println(Arrays.toString(c));
          
          System.out.println(Arrays.binarySearch(c, 55));
          System.out.println(Arrays.binarySearch(c, 10));
          System.out.println(Arrays.binarySearch(c, -90));
          
          int[] d = Arrays.copyOfRange(c, 3, 10);
          System.out.println(Arrays.toString(d));
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}

}
