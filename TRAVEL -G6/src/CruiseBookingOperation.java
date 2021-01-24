import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CruiseBookingOperation {
	
	//Add record - the data will be saved in bookingDetail.txt 
	 public void addRecord(CruiseBook booking) throws IOException
	  
	  {
		  File fileName = new File ("bookingDetail.txt");
		  FileWriter fw = new FileWriter(fileName);
		  PrintWriter pw = new PrintWriter(fw);  
		  
		  pw.println(booking.getRefNo());
		  pw.println(booking.getDate());
		  pw.println(booking.getName());
		  pw.println(booking.getIcPassport());
		  pw.println(booking.getAddress());
		  pw.println(booking.getContactNo());
		  pw.println(booking.getCruisePackage());
		  pw.println(booking.getPClass());
		  pw.println(booking.getPClassPrice());
		  pw.println(booking.getPprice());
		  pw.println(booking.getExtraPax());
		  pw.println(booking.getTotalPayment());
		 
		  pw.close();
		  fw.close();
	  } 
}
