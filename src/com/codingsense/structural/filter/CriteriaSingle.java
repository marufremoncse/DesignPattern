package com.codingsense.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {
	List<Person> singlePersons = new ArrayList<Person>();

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		singlePersons = persons.stream().filter(person -> person.getMaritalStatus().equalsIgnoreCase("single"))
				.collect(Collectors.toList());
		return singlePersons;
	}

}