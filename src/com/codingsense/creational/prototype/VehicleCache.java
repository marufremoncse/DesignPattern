package com.codingsense.creational.prototype;

import java.util.HashMap;

public class VehicleCache {
	HashMap<String, Vehicle> hMap = new HashMap<String, Vehicle>();

	public Vehicle getVehicle(String id) throws CloneNotSupportedException {
		return (Vehicle) hMap.get(id).clone();
	}

	public void loadCache() {
		Vehicle v1 = new Car();
		hMap.put("1", v1);

		Vehicle v2 = new Motorbike();
		hMap.put("2", v2);

		Vehicle v3 = new Truck();
		hMap.put("3", v3);
	}
}
