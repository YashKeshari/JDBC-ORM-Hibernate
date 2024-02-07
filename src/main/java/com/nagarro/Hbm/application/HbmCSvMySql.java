package com.nagarro.Hbm.application;
import java.util.Scanner;
import com.nagarro.Hbm.*;

import com.nagarro.Hbm.Controller.ControllerClass;
import com.nagarro.Hbm.enums.color;
import com.nagarro.Hbm.enums.gender;
import com.nagarro.Hbm.enums.size;
import com.nagarro.Hbm.model.InputValues;




public class HbmCSvMySql {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean
        
		InputValues id = new InputValues();

		System.out.println("Enter color of Tshirt:\n(You can choose from-\nPurple,Maroon,Black\nYellow,Blue,Grey\nWhite,Pink)");
		
		String s1= sc.nextLine();
		if (s1 == null || s1.isEmpty()) {
			try {
				throw new Exception("Color cannot be empty! \n");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		boolean isValid = true;
		do {
			try {
				
				if (color.valueOf(s1.toUpperCase()) != null)
					isValid = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Enter valid color name!\n");
				throw new Exception("Please choose valid color! \n");
				
			}

		} while (isValid);
	    id.setColor(s1.trim().toUpperCase());
        
        
        
        
	
        
		System.out.println("Please, Enter the Size: ");
		String s2=sc.nextLine();
		if (s2 == null || s2.isEmpty()) {
			try {
				throw new Exception("Size cannot be empty! \n");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		do {
			try {
				
				if (size.valueOf(s2.toUpperCase()) != null)
					isValid = false;
			} catch (IllegalArgumentException e) {
			
				throw new Exception("Please choose valid size! \n");
				
			}

		} while (isValid);
		
		

		
		id.setSize(s2.trim().toUpperCase());
		

		
		
		System.out.println("Please, Enter the Gender: \n (M , F or U) ");
		String s3= sc.nextLine();
		if (s3 == null || s3.isEmpty()) {
			try {
				throw new Exception("Gender cannot be empty! \n");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		do {
			try {
				
				if (gender.valueOf(s3.toUpperCase()) != null)
					isValid = false;
			} catch (IllegalArgumentException e) {
			
				throw new Exception("Please choose valid gender! \n");
				
			}

		} while (isValid);
		id.setGender(s3.trim().toUpperCase());
	
		
		System.out.println(
				"Please, Enter the Output Preference: \n "
						+ "( for Price enter 1 , for Rating enter 2 and for both  Price and Rating enter 3)");

		int outPref = sc.nextInt();
		
		if(outPref==1) {
			id.setOP(String.valueOf(com.nagarro.Hbm.enums.outputPref.PRICE));
		}else if(outPref==2) {
			id.setOP(String.valueOf(com.nagarro.Hbm.enums.outputPref.RATING));	
		}else if(outPref==3) {
			id.setOP(String.valueOf(com.nagarro.Hbm.enums.outputPref.PRICEANDRATING));
		}else {
			sc.close();
			throw new Exception("Please, select valid output preference");
		}
		
		ControllerClass cc = new ControllerClass();
		cc.dataMySql();
		cc.FilterAndSort();
		sc.close();
	}
}





//String firstLetStr = colorStore.substring(0, 1);
//
//String remLetStr = colorStore.substring(1);
//
//firstLetStr = firstLetStr.toUpperCase();
//remLetStr = remLetStr.toLowerCase();
