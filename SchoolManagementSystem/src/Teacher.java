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
	
	@Override
	public String toString() {
		return "Teacher: {name: "
				+ this.name
				+ ", grade: "
				+ this.grade
				+ "}.";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
