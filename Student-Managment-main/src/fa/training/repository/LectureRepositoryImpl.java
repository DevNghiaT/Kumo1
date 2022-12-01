package fa.training.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Lecture;
import fa.training.entities.Student;

public class LectureRepositoryImpl implements LectureRepository {

	List<Lecture> lectures = new ArrayList<>();

	@Override
	public void initLectureByKeyboard(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Input lecture " + i);
			Lecture lecture = new Lecture();
			lecture.inputData(null);
			lectures.add(lecture);
		}
	}

	@Override
	public void displayLectures() {
		if (lectures.isEmpty()) {
			System.out.println("Empty");
			return;
		}
		for (Lecture lecture : lectures) {
			lecture.display();
		}
	}

	@Override
	public void initLectureByFile() {
		String line = "";
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(System.getProperty("user.dir") + "\\src\\lecture.txt"))) {
			while ((line = bufferedReader.readLine()) != null) {
				String[] val = line.split("\t");
				Lecture lecture = new Lecture();
				lecture.setName(val[0]);
				lecture.setAddress(val[1]);
				lecture.setLecID(val[2]);
				lectures.add(lecture);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}

}
