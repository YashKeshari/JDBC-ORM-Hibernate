package com.nagarro.Hbm.services;

import java.io.IOException;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nagarro.Hbm.enums.outputPref;
import com.nagarro.Hbm.model.InputValues;

import com.opencsv.exceptions.CsvValidationException;
 

public class Operations implements ServiceCalling {

	public void prac()throws Exception {
		
		InputValues  idata = new InputValues();
		
		  Class.forName("com.mysql.cj.jdbc.Driver"); 
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tshirts", "root", "root");
		 
		
		  
		    
		  String sql ="";
                  
		  
		  System.out.println("Here is the Output:-");
		  if(idata.getOP().equalsIgnoreCase(String.valueOf(outputPref.PRICE)))
		  {
			  sql= "select * from csvalues where colour = ? and size = ? and gender = ? ORDER BY Price";
			 
			  
		  }else if(idata.getOP().equalsIgnoreCase(String.valueOf(outputPref.RATING))) {

			  sql= "select * from csvalues where colour = ? and size = ? and gender = ? ORDER BY Rating";
			
		  }else {
			  sql= "select * from csvalues where colour = ? and size = ? and gender = ? ORDER BY Price, Rating";
		  }
		  
		  PreparedStatement stmt=con.prepareStatement(sql);  
		  
		  stmt.setString(1,idata.getColor());  
		  stmt.setString(2,idata.getSize());  
		  stmt.setString(3,idata.getGender()); 
		  
		  ResultSet rs=stmt.executeQuery(); 
		  
		  int i = 0;
		  System.out.println("ID  |  Availability | colour | gender |  name |  price |  rating  | size\n");
			while (rs.next()) {
				i++;

				System.out.println(rs.getString(1) + " |  " + rs.getString(2) + "  | " + rs.getString(3) + " |  "
						+ rs.getString(4) + "  | " + rs.getString(5) + " |  " + rs.getDouble(6) + "  | " + rs.getDouble(7) + " | "
						+ rs.getString(8));

			}
			if (i == 0) {
				throw new Exception(" Sorry, this tshirt is rare.. we will try our best to add this in our store ");
			}
		  
		  
	}

	@Override
	public void add2db() throws CsvValidationException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
	}
}