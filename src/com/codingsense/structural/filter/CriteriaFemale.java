package com.codingsense.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {
	List<Person> femalePersons = new ArrayList<Person>();

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		femalePersons = persons.stream().filter(person -> person.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
		return femalePersons;
	}

}
