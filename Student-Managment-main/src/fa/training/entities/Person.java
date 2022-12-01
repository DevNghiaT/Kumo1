package fa.training.entities;

import java.util.Scanner;

public abstract class Person {
	protected String name;
	protected String address;

	public abstract String getName();

	public abstract String getAddress();

	public abstract void setName(String name);

	public abstract void setAddress(String address);

	public abstract void inputData(Scanner scanner);

	public abstract void display();

	@Override
	public abstract String toString();

}
