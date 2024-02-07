package com.nagarro.Hbm.services;

import java.io.File;




import com.sun.xml.fastinfoset.sax.Properties;
import java.io.FileReader;
import java.io.IOException;
import org.hibernate.cfg.Configuration;
import java.sql.SQLException;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transaction;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.nagarro.Hbm.model.HbmMySqlValues;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;






public class CsvToDb implements ServiceCalling {

	public void add2db() throws CsvValidationException, NumberFormatException, IOException  {
         Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(HbmMySqlValues.class);

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties())
				.build();
		
		org.hibernate.SessionFactory factory = con.buildSessionFactory(serviceRegistry);

		org.hibernate.Session session = factory.openSession();

		
		File file = new File("CSVFiles");

		
		for (File fileEntry : file.listFiles()) {

			File internalFile = new File(fileEntry + "");

			FileReader filereader = new FileReader(internalFile + "");

			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();

			String data[];
			String items = "";
			
			while ((data = csvReader.readNext()) != null) {
				HbmMySqlValues values = new HbmMySqlValues();
				
				org.hibernate.Transaction tx = session.beginTransaction();
				for (int i = 0; i < data.length; i++) {
					
					
					
					items = data[i];
					String str[] = items.split("\\|");
					
					values.setId(str[0]);
					values.setName(str[1]);
					values.setColour(str[2]);
					values.setGender_recommendation(str[3]);
					values.setSize(str[4]);
					values.setPrice(Double.parseDouble(str[5]));
					values.setRating(Double.parseDouble(str[6]));
					values.setAvailability(str[7]);
					
					
					session.save(values);

					
					
				}
				
				tx.commit();
				

			
			}
		
			
		}
		 
		
//		Transaction tx = session.beginTransaction();
//		session.save((HbmMySqlValues)hbmData);
//
//		tx.commit();
		}

	
	
	
	
	
	
	@Override
	public void prac() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
