import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ReadDataCsv {
	public static void main(String[] args) {

		Employee arr[] = new Employee[5];
		try {
			FileReader fr = new FileReader("excel.csv");
			CSVParser csv = new CSVParser(fr, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase());
			int i = 0;
			for (CSVRecord csvRecord : csv) {
				Employee e1 = new Employee();

				e1.name = csvRecord.get(0);
				e1.age = csvRecord.get(1);
				e1.designation = csvRecord.get(2);
				e1.salary = csvRecord.get(3);
				
				arr[i++]=e1;
				

			}
			System.out.println("read");

			for (Employee e : arr) {
				System.out.println(e.name);
				System.out.println(e.age);
				System.out.println(e.designation);
				System.out.println(e.salary);
				System.out.println("========");
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
