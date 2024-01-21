
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
	
	@Override
	public String toString() {
		return "Student: {name: "
				+ this.name
				+ ", grade: "
				+ this.grade + "}.";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
