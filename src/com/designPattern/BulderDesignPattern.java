package com.designPattern;

public class BulderDesignPattern {

	public static void main(String[] args) {

		HouseConstructor houseConstructor = new HouseConstructor();

		houseDirector houseDirector = new houseDirector(houseConstructor);

		House buildHouse = houseDirector.buildHouse();

		System.out.println(buildHouse);

	}

}

class House {

	private String houseFoundationl;
	private String houseWalls;
	private String houseRoof;

	public void setHouseFoundationl(String houseFoundationl) {
		this.houseFoundationl = houseFoundationl;
	}

	public void setHouseWalls(String houseWalls) {
		this.houseWalls = houseWalls;
	}

	public void setHouseRoof(String houseRoof) {
		this.houseRoof = houseRoof;
	}

	@Override
	public String toString() {
		return "House [houseFoundationl=" + houseFoundationl + ", houseWalls=" + houseWalls + ", houseRoof=" + houseRoof
				+ "]";
	}

}

class HouseConstructor {

	private House house;

	public HouseConstructor() {
		this.house = new House();
	}

	public void buildHouseFundamental() {
		this.house.setHouseFoundationl("This is Fundamental of House.");
	}

	public void buildHouseWalls() {
		this.house.setHouseWalls("This is house Wall.");
	}

	public void buildHouseRoof() {
		this.house.setHouseRoof("This is Roof of House");
	}

	public House getBuildHouse() {
		return this.house;
	}
}

class houseDirector {

	HouseConstructor houseConstructor;

	public houseDirector(HouseConstructor houseConstructor) {
		this.houseConstructor = houseConstructor;
	}

	public House buildHouse() {
		this.houseConstructor.buildHouseFundamental();
		this.houseConstructor.buildHouseRoof();
		this.houseConstructor.buildHouseWalls();

		return this.houseConstructor.getBuildHouse();
	}

}
