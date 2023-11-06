
public class Main06 {

	public static void main(String[] args) {
         int[][] a = new int[3][2]; //Regular Array
         
         a[0][0] = 5;
         a[0][1] = 10;
         a[1][0] = 6;
         a[1][1] = 12;
         a[2][0] = 7;
         a[2][1] = 14;
         
         for(int i=0 ;i<a.length;i++) {
        	 
        	 for(int j=0;j<a[i].length;j++) {
        		 
        		 System.out.print(a[i][j] + " ");
        	 }
        	 System.out.println();
         }
         
	}

}
