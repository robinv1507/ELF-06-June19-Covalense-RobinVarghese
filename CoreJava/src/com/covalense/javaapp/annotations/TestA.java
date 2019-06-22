package com.covalense.javaapp.annotations;

/*
 * Annotation demo program,
 * @SuppressWarnings will suppress the warning
 */
@SuppressWarnings({ "deprecation", "unused" })
public class TestA {
	public static void main(String[] args) {

		Mouse m = new Mouse();
		m.click();

		m.scroll();// calling deprecated method will give warning

	}

	void m() {
		int c;// unused variable
	}

}
