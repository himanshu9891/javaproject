package com.him;

import java.util.Comparator;

public class CountryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getCountry().compareTo(o2.getCountry());
	}

}
