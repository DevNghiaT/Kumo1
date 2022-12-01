package fa.training.entities;

import java.util.Scanner;

public class Lecture extends Person {
	private String lecID;

	public Lecture() {
		super();
	}

	public Lecture(String name, String address, String lecID) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.lecID = lecID;
	}

	public String getLecID() {
		return lecID;
	}

	public void setLecID(String lecID) {
		this.lecID = lecID;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void inputData(Scanner scanner) {
		scanner = new Scanner(System.in);
		System.out.print("Name: ");
		this.setName(scanner.nextLine());

		System.out.print("Address: ");
		this.setAddress(scanner.nextLine());

		System.out.print("LecID: ");
		this.setLecID(scanner.nextLine());

	}

	@Override
	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Lecture [name=" + name +", address=" + address + "lecID=" + lecID + "]";
	}

}
