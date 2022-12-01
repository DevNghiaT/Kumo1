package fa.training.repository;

public interface StudentRepository {
	public void initStudentByKeyboard(int n);
	
	public void displayStudents();
	
	public boolean searchStudentByName(String name);
	
	public Double searchMaxGrade();
	
	public void initStudentByFile();
}
