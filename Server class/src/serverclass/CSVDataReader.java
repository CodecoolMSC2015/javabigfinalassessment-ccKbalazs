package serverclass;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {
	String csvFilePath = "c:\\savedFiles\\persons.csv";
	List<Person> persons;
	
	CSVDataReader(String csvFilePath){
		this.csvFilePath = csvFilePath;
	}

	Set<Person> getPersons(){
		return null;
	}
}