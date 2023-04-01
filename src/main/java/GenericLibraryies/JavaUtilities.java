package GenericLibraryies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtilities {
	public int generaterandomNumber(int limit) {
		Random random =new Random();
		return random.nextInt(limit);
		
	}
     public String getCurrentTime() {
    	 Date date=new Date();
    	 SimpleDateFormat sdf =new SimpleDateFormat("dd_mm_yyyy_hh_mm_sss");
    	 
		return sdf.format(date);
     }
}
