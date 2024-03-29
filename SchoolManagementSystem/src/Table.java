import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table {
	
	protected String name;
	protected ArrayList<String> fields;
	protected HashMap<String, ArrayList<String>> data;
	
	Table(String name) {
		this.name = name;
		this.fields = new ArrayList<String>();
		this.data = new HashMap<String, ArrayList<String>>();
	}
	
	@Override
	public String toString() {
		String fieldString = "Table named: " + this.name + ", with Fields:";
		for (String field : this.fields) {
			fieldString += field + ", ";
		}
		return fieldString;
	}
}
