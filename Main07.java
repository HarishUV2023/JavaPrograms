
public class Main07 {

	public static void main(String[] args) {
        String[] [] s = new String[3][]; //jagged array
        s[0] = new String[3];
        s[1] = new String[1];
        s[2] = new String[2];
        
        s[0][0] = "Sachin";
        s[0][1] = "Dhoni";
        s[0][2] = "Sehwagh";
        
        s[1][0] = "Virat";
        
        s[2][0] = "Rohit";
        s[2][1] = "Pandya";
        
        System.out.println(s[1][0].length());
        
        for(int i=0 ; i<s.length;i++) {
        	
        	for(int j=0; j<s[i].length;j++) {
        		
        		System.out.print(s[i][j] + " ");
        	}
        	System.out.println();
        }
        
	}

}
