package madhan;

import java.text.SimpleDateFormat;
import java.util.*;

public class time {

	public static void main(String[] args) {
		Date now=new Date();
		SimpleDateFormat time=new SimpleDateFormat();
		String time1=time.format(now);
		System.out.println(now);
		System.out.println(time1);
		
	}

}
