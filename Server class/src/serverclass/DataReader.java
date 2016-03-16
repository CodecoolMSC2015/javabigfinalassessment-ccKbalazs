package serverclass;

import java.util.Set;

abstract class DataReader {
	String searchCriteria;
	SearchType searchType;
	
	Set<Person> getPersons(){
		return null;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}
}