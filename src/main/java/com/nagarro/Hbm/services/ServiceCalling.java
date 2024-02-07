package com.nagarro.Hbm.services;

import java.io.IOException;

import java.sql.SQLException;



import com.opencsv.exceptions.CsvValidationException;

public interface ServiceCalling {
	public void add2db() throws CsvValidationException, NumberFormatException, IOException ;
	
	public void prac()throws ClassNotFoundException, SQLException, Exception ;
}
