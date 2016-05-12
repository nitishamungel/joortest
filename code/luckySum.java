public class luckySum {
	
	public static void main(String args[]){
		 int a,b,c,sum;
		 sum=luckySum(13,2,3);
		 System.out.println("Sum is " + sum);
		 sum=luckySum(1,13,3);
		 System.out.println("Sum is " + sum);
		 sum=luckySum(1,2,13);
		 System.out.println("Sum is " + sum);
		 sum=luckySum(1,2,3);
		 System.out.println("Sum is " + sum);
	 }
	
	 public static int luckySum (Integer... numbers) {
	      int sum = 0;
	      for(int i=0; i <numbers.length; i++) {
	        if(numbers[i] == 13) {
	          break;
	        }
	        sum = sum + numbers[i];
	      }
	      return sum;
	 }
} 
