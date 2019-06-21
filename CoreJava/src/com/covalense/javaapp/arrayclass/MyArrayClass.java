package com.covalense.javaapp.arrayclass;

public class MyArrayClass {

	private Object[] myArray;
	private static int initialSize=10;

	private int index;

	public MyArrayClass() {
		this(initialSize);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero");
		}

		myArray = new Object[size];
		index = 0;
	}// end of constructor

	public void add(Object val) {
		if (index >= myArray.length) {

			Object[] newArray = new Object[myArray.length*2];
			System.arraycopy(myArray, 0, newArray, 0, myArray.length);
			myArray = newArray;
		}

		myArray[index] = val;
		index++;

	}

	public void remove(int position) {

		if (position >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException("array out of bound");
		} else {
			System.arraycopy(myArray, (position + 1), myArray, position, (myArray.length - 1) - position);
			myArray[myArray.length - 1] = null;
		}
	}

	public Object get(int position) {

		return myArray[position];

	}
	public int getSize()
	{
		return index-1;
	}

}// end class
