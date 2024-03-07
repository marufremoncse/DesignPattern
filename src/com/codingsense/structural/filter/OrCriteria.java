package com.codingsense.structural.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	Criteria firstCriteria;
	Criteria secondCriteria;

	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredList = this.firstCriteria.meetCriteria(persons);
		List<Person> finalFilteredList = this.secondCriteria.meetCriteria(persons);

		for (Person p : filteredList) {
			if (!finalFilteredList.contains(p)) {
				finalFilteredList.add(p);
			}
		}

		return finalFilteredList;
	}
}
