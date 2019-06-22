package com.covalense.javaapp.collectionframework;

public class Student implements Comparable<Student> {
	String name;
	int id;
	double percentage;

	/*
	 * logic to sort student with name
	 */
	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.name);

	}

	/*
	 * logic to sort student with id
	 
	
	 * @Override public int compareTo(Student o) {
	 * 
	 * if (this.id < o.id) { return -1;
	 * 
	 * } else if (this.id > o.id) { return 1;
	 * 
	 * } else { return 0; }
	 * 
	 * 
	 * }
	 */
	/*
	 * logic to sort student with percentage
	 */
	/*
	 * public int compareTo(Student o) {
	 * 
	 * if (this.percentage < o.percentage) { return -1;
	 * 
	 * } else if (this.percentage > o.percentage) { return 1;
	 * 
	 * } else { return 0; } }
	 */

}
