public class firstHalf {
	public static void main(String[] args) {
	     String str1 = "woohoo";
	     String str2 = "Hello";
	     String str3 = "a";
	     String str4 = "";
	
	     String first_half = makeHalfString(str1);
	     System.out.println("First half is " +first_half);
	        
	     first_half = makeHalfString(str2);
	     System.out.println("First half is " +first_half);
	        
	     first_half = makeHalfString(str3);
	     System.out.println("First half is " +first_half);
	     
	     first_half = makeHalfString(str4);
	     System.out.println("First half is " +first_half);	
	}
	
    public static String makeHalfString(String str){
    	int x = str.length();
        if(x%2==0)
        	return str.substring(0, x/2);
        else
        	return str.substring(0, x/2+1);
    }      
}
