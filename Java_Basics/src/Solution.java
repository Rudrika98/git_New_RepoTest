import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	
   public static void main(String[] args)
   {
	
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	    int n =0;
		try {
			n = Integer.parseInt(bufferedReader.readLine().trim());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}

//	    Result.fizzBuzz(n);
	    Practise.printOutput(n);

	    try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   }
	

}
