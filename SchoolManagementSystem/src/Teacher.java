import java.util.ArrayList;

public class Teacher {
	
	private String name;
	private int grade;
	private ArrayList<Student> students;
	
	Teacher(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.students = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public ArrayList<Student> getStudents() {
		return this.students;
	}
}
