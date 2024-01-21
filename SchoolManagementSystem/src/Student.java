
public class Student {
	
	private String name;
	private int grade;
	private Teacher teacher;
	
	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.teacher = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
}
