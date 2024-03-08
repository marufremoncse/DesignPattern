package com.codingsense.structural.Composite;

public class Main {
	public static void main(String[] args) {
		Employee CEO = new Employee("CEO", "Sales & Marketing", 100000);
		Employee headSales = new Employee("Head", "Sales", 80000);
		Employee headMarketing = new Employee("Head", "Marketing", 70000);

		Employee salesManager1 = new Employee("Sales Manager", "Sales", 25000);
		Employee salesManager2 = new Employee("Sales Manager", "Sales", 30000);

		Employee marketingManager1 = new Employee("Marketing Manager", "Marketing", 40000);
		Employee marketingManager2 = new Employee("Marketing Manager", "Marketing", 30000);
		Employee marketingManager3 = new Employee("Marketing Manager", "Marketing", 35000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesManager1);
		headSales.add(salesManager2);

		headMarketing.add(marketingManager1);
		headMarketing.add(marketingManager2);
		headMarketing.add(marketingManager3);

		for (Employee e1 : CEO.subordinates) {
			System.out.println("Level 1: " + e1);

			for (Employee e2 : e1.subordinates) {
				System.out.println("Level 2: " + e2);
			}
			System.out.println();
		}
	}
}
