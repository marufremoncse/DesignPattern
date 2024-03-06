package com.codingsense.creational.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		VehicleCache vehicleCache = new VehicleCache();
		vehicleCache.loadCache();
		Vehicle v1 = vehicleCache.getVehicle("1");
		System.out.println(v1.getType());

		Vehicle v2 = vehicleCache.getVehicle("2");
		System.out.println(v2.getType());

		Vehicle v3 = vehicleCache.getVehicle("3");
		System.out.println(v3.getType());

		System.out.println(v1.hashCode());
		System.out.println(vehicleCache.hMap.get("1").hashCode());
		System.out.println(v2.hashCode());
		System.out.println(vehicleCache.hMap.get("2").hashCode());
		System.out.println(v3.hashCode());
		System.out.println(vehicleCache.hMap.get("3").hashCode());
	}

}
