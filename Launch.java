
public class Launch {

	public static void main(String[] args) {
          
		int x = 15;
		int z[];
		z = new int[-2];
		z[0]=12;
		
		int[] t = {10,20,30,40,50};
		float[] f = {12.5f,34.56f};
		System.out.println(f);
		
		int[] a = new int[5];
		a[0]=15;
		a[1]=10;
		a[2]=56;
		a[3]=90;
		a[4]=28;
		System.out.println(a);
	  for(int i=0;i<a.length;i++) {
		  System.out.println(a[i]);
	  }
		
		String[] s = new String[3];
		s[0]="Sachin";
		s[1]="Dhoni";
		s[2]="Virat";
		System.out.println(s);
		  for(int i=0;i<s.length;i++) {
			  System.out.println(s[i]);
		  }
	}

}
