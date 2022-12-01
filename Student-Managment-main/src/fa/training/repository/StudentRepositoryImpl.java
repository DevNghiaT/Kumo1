package fa.training.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Student;

public class StudentRepositoryImpl implements StudentRepository {

	public static List<Student> students = new ArrayList<>();

	@Override
	public void initStudentByKeyboard(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Input student " + i);
			Student student = new Student();
			student.inputData(null);
			students.add(student);
		}
	}

	@Override
	public void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		for (Student student : students) {
			student.display();
		}
	}

	@Override
	public boolean searchStudentByName(String name) {
		for (Student student : students) {
			if (name.equals(student.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Double searchMaxGrade() {
		Double result = 0d;
		for (Student student : students) {
			if (result < student.getGrade()) {
				result = student.getGrade();
			}
		}
		return result;
	}

	@Override
	public void initStudentByFile() {
		String line = "";
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(System.getProperty("user.dir") + "\\src\\student.txt"))) {
			while ((line = bufferedReader.readLine()) != null) {
				String[] val = line.split("\t");
				Student student = new Student();
				student.setName(val[0]);
				student.setAddress(val[1]);
				student.setStudentID(val[2]);
				student.setLecID(val[3]);
				student.setTopicTitle(val[4]);
				student.setGrade(Double.parseDouble(val[5]));
				students.add(student);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
