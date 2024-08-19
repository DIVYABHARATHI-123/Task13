package task13;

import java.io.FileReader;

public class FileNotFoundExceptionQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
		        FileReader ask= new FileReader("D:\\MY doc certificate");
		    } 
		       catch (java.io.FileNotFoundException e) 
		       {
		        e.printStackTrace();
		        System.out.println("handling file not found exception");
		        System.out.println(e.getMessage());
		        System.out.println(e.getClass());

		    }
		

	}

}
