
public class Main01 {

	public static void main(String[] args) {
            int x = 10;
            int[] arr = new int[5];//0-4
          //  arr[0]=10;
            arr[1]=20;
            arr[2]=30;
          //  arr[3]=40;
            arr[4]=50;
            System.out.println(arr.length);
            
            for(int i=0;i<arr.length;i++) {
            	System.out.println(arr[i]);
            }
           System.out.println();
            
            String[] s = new String[3];
            s[0] = "Virat";
          //  s[1] = "Rohit";
            s[2] = "hardik";
            
            for(int i=0;i<s.length;i++) {
            	System.out.println(s[i]);
            }
            
	}

}
