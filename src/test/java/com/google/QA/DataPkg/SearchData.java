package com.google.QA.DataPkg;

import org.testng.annotations.DataProvider;

public class SearchData {
	
	@DataProvider (name="Positive search data")
	public String[] positiveSearchData() {
		String[] data = {
				"apple",
				"samsung",
				"lg"	
		};
		return data;
	}

}
