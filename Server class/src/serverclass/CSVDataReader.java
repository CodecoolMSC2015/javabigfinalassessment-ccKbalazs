package serverclass;

import java.util.List;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons;
	
	CSVDataReader(String csvFilePath){
		this.csvFilePath = csvFilePath;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}
