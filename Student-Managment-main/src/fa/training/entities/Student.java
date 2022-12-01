package fa.training.entities;

import java.util.Scanner;

public class Student extends Person {
	private String studentID;
	private String lecID;
	private String topicTitle;
	private Double grade;

	public Student() {
		super();
	}

	public Student(String name, String address, String studentID, String lecID, String topicTitle, Double grade) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.studentID = studentID;
		this.lecID = lecID;
		this.topicTitle = topicTitle;
		this.grade = grade;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getLecID() {
		return lecID;
	}

	public void setLecID(String lecID) {
		this.lecID = lecID;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
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

		System.out.print("StdID: ");
		this.setStudentID(scanner.nextLine());

		System.out.print("LecID: ");
		this.setLecID(scanner.nextLine());

		System.out.print("TopicTitle: ");
		this.setTopicTitle(scanner.nextLine());
		
		System.out.print("Grade: ");
		this.setGrade(Double.parseDouble(scanner.nextLine()));
	}

	@Override
	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Student [name=" + name +", address=" + address + " studentID=" + studentID + ", lecID=" + lecID + ", topicTitle=" + topicTitle + ", grade="
				+ grade + "]";
	}

}
