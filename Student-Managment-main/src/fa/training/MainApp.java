package fa.training;

import java.util.Scanner;

import fa.training.repository.LectureRepositoryImpl;
import fa.training.repository.StudentRepositoryImpl;

public class MainApp {
	static StudentRepositoryImpl studentRepositoryImpl = new StudentRepositoryImpl();
	static LectureRepositoryImpl lectureRepositoryImpl = new LectureRepositoryImpl();
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void showStudentMenu() {
		while (true) {
			System.out.println("1. Init Students by keyboard");
			System.out.println("2. Display all");
			System.out.println("3. Search by name");
			System.out.println("4. Max Grade");
			System.out.println("5. Init by readfile");
			System.out.println("Other. Exit");
			String ch = scanner.nextLine();
			switch (ch) {
			case "1": {
				System.out.print("Enter total students: ");
				int n = Integer.parseInt(scanner.nextLine());
				studentRepositoryImpl.initStudentByKeyboard(n);
				break;
			}
			case "2": {
				studentRepositoryImpl.displayStudents();
				break;
			}
			case "3": {
				System.out.print("Name to search: ");
				String name = scanner.nextLine();
				System.out.println(studentRepositoryImpl.searchStudentByName(name) ? "Founded" : "Not founded");
				break;
			}
			case "4": {
				Double res = studentRepositoryImpl.searchMaxGrade();
				System.out.println("Max grade = " + res);
				break;
			}
			case "5": {
				studentRepositoryImpl.initStudentByFile();
				break;
			}
			default:
				return;
			}
		}
	}
	
	public static void showLectureMenu() {
		while (true) {
			System.out.println("1. Init Lectures by keyboard");
			System.out.println("2. Display all");
			System.out.println("3. Init by readfile");
			System.out.println("Other. Exit");
			String ch = scanner.nextLine();
			switch (ch) {
			case "1": {
				System.out.print("Enter total lectures: ");
				int n = Integer.parseInt(scanner.nextLine());
				lectureRepositoryImpl.initLectureByKeyboard(n);
				break;
			}
			case "2": {
				lectureRepositoryImpl.displayLectures();
				break;
			}
			case "3": {
				lectureRepositoryImpl.initLectureByFile();
				break;
			}
			default:
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Sudent Menu");
			System.out.println("2. Lecture Menu");
			System.out.println("Other. Exit");
			String ch = scanner.nextLine();
			switch (ch) {
			case "1": {
				showStudentMenu();
				break;
			}
			case "2": {
				showLectureMenu();
				break;
			}

			default:
				System.out.println("Program is ended");
				return;
			}
		}
	}

}
