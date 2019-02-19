import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Cat {
	public static void cat(File file) {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    //added a catch
	    } catch (IOException e){
	    	e.printStackTrace();
	    }finally {
	        if (input != null) {
	        	//added a try/catch
	            try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	    }
	}
	
}
