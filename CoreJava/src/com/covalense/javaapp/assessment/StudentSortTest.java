package com.covalense.javaapp.assessment;

import java.util.TreeSet;

/*21)	WAP to sort the students by role number,
 *  name and percentage based on the user request.
 *
 */
import lombok.extern.java.Log;

@Log
public class StudentSortTest {

	public static void main(String[] args) {

		Student student1 = new Student(2, "John", 30.00,"male");
		Student student2 = new Student(9, "Abhay", 75.50,"male");
		Student student3 = new Student(1, "Ria", 60.00,"female");
		Student student4 = new Student(7, "Yogesh", 87.00,"female");
		Student student5 = new Student(5, "Leena", 48.00,"female");

		TreeSet<Student> studentsList = null;

		SortByRequest req = new SortByRequest();
        //user request
		String choice = "PERC";

		switch (choice) {
		case "ROLE":
			studentsList = new TreeSet<>(req.sortByRoleNumber());
			break;
		case "NAME":
			studentsList = new TreeSet<>(req.sortByName());
			break;
		case "PERC":
			studentsList = new TreeSet<>(req.sortByPercentage());
			break;
		default:
			log.info("Wrong Choice");
		}
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		studentsList.add(student5);

		for (Student student : studentsList) {
			log.info("" + student);
		}//for end

	}//end of main
}//end of class
