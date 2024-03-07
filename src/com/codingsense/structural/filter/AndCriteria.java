package com.codingsense.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {
	Criteria firstCriteria;
	Criteria secondCriteria;

	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredList = this.firstCriteria.meetCriteria(persons);
		return secondCriteria.meetCriteria(filteredList);
	}

}