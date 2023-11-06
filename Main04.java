//Write a program to sort elements 
//take a array of index 10 with value 1 to 10
//print all even values and odd values
public class Main04 {

	public static void main(String[] args) {
          int[] a = new int[10];
          a[0]= 1;
          a[1]= 2;
          a[2]= 3;
          a[3]= 4;
          a[4]= 5;
          a[5]= 6;
          a[6]= 7;
          a[7]= 8;
          a[8]= 9;
          a[9]= 10;
          
          //Printing all data
          for(int i=0;i<a.length;i++) {
        	  System.out.print(a[i] + ", ");
          }
          System.out.println();
          
          //Printing Even Numbers
          System.out.print(" Even Numbers :");
          
          for(int i=0;i<a.length;i++) {
        	  
        	  if(a[i]%2==0) {
        	  System.out.print(a[i] + ", ");
        	  }
        	  
          }
          System.out.println();
          
          //Printing Odd Numbers
          System.out.print(" Odd Numbers :");
          
          for(int i=0;i<a.length;i++) {
        	  
        	  if(a[i]%2==1) {
        	  System.out.print(a[i] + ", ");
        	  }
        	  
          }
          
	}

}
