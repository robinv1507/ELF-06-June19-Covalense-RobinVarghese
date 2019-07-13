package com.covalense.javaapp.assessment;

import lombok.Getter;

@Getter
public class Product {

	int pid;
	String ptype;
	String name;
	double cost;

	public Product(int pid, String ptype, String name, double cost) {
		super();
		this.pid = pid;
		this.ptype = ptype;
		this.name = name;
		this.cost = cost;
	}//end of constructor

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		result = prime * result + ((ptype == null) ? 0 : ptype.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid != other.pid)
			return false;
		if (ptype == null) {
			if (other.ptype != null)
				return false;
		} else if (!ptype.equals(other.ptype))
			return false;
		return true;
	}

	
	

}//end of class
