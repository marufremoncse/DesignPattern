package com.codingsense.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {
	List<Person> malePersons = new ArrayList<Person>();

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		malePersons = persons.stream().filter(person -> person.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());
		return malePersons;
	}

}
