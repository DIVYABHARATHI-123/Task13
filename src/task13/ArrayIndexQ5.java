package task13;

public class ArrayIndexQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] numbers = new int[]{1,2,3,4,5} ; 
		    try {
		        int lastnumber = numbers[5]; 
		        System.out.println("arrayindexoutofboundexception"+lastnumber);
		   
		    } catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("handling array index out of bound exception");
		        System.out.println(e.getMessage());
		        e.printStackTrace();
		    }
	}



}
