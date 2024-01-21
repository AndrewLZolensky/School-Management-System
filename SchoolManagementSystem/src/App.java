
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// read students into database, print all
		// read teachers into database, print all
		// assign students to teachers based on grade
		// display classes
		
		// create new student
		Student jimmy = new Student("Jimmy", 4);
		jimmy.print();
		
		// create new teacher
		Teacher jane = new Teacher("Jane", 4);
		jane.print();
		System.out.println();
		
		// create new database
		Database db = new Database();
		
		// create new tables
		Table students = new Table("Students");
		Table teachers = new TeacherTable("Teachers");
		System.out.println(teachers.toString());
		System.out.println();
		
		// add new tables to database
		db.addTable(students);
		db.addTable(teachers);
		db.print();
	}

}
