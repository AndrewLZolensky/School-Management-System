import java.util.ArrayList;

public class Database {
	
	private ArrayList<Table> tables;
	
	Database() {
		this.tables = new ArrayList<Table>();
	}
	
	Database(ArrayList<Table> tables) {
		this.tables = tables;
	}
	
	ArrayList<Table> getTables() {
		return this.tables;
	}
	
	public void addTable(Table table) {
		this.tables.add(table);
	}
	
	public void print() {
		
		for (Table table : this.tables) {
			System.out.println(table.toString());
		}
	}
}
