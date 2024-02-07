package com.nagarro.Hbm.Controller;

import java.io.IOException;






import com.nagarro.Hbm.services.CsvToDb;
import com.nagarro.Hbm.services.Operations;
import com.nagarro.Hbm.services.ServiceCalling;
import com.opencsv.exceptions.CsvValidationException;

public class ControllerClass {

	public void FilterAndSort() throws Exception {
		ServiceCalling sc = new Operations();
		
		sc.prac();
		
	}
	
	public void dataMySql() throws CsvValidationException, NumberFormatException, IOException {
		ServiceCalling dataCalling = new CsvToDb();
		dataCalling.add2db();
	}
	
}
