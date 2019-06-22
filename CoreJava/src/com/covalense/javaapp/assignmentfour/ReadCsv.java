import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ReadCsv {
    public static void main(String[] args) {
		
    	
		try {
			FileReader fr=new FileReader("excel.csv");
			CSVParser cp=new CSVParser(fr, CSVFormat.DEFAULT .withFirstRecordAsHeader().withIgnoreHeaderCase());
			
			 for (CSVRecord csvRecord : cp) {
	                // Accessing Values by Column Index
	                String name = csvRecord.get(0);
	                String age  = csvRecord.get(1);
	                String designation = csvRecord.get(2);
	                String Salary = csvRecord.get(3);
	                
	                
	                
	                System.out.println("name : " + name);
	                System.out.println("age : " + age);
	                System.out.println("designation : " + designation);
	                System.out.println("Salary : " + Salary);

	                System.out.println("---------------\n\n");
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
