# JDBC-ORM-Hibernate
Implemented a standalone product search program in Java, using Hibernate that lists matching products for a user who is looking for T-shirts. There are given 3 CSV files, each containing the T-shirts data for Nike, Puma and Adidas respectively.



<img width="924" alt="image" src="https://github.com/YashKeshari/JDBC-ORM-Hibernate/assets/79370070/2506fd34-d6fa-4fbc-bf2a-04a83d360469">


PROBLEM STATEMENT:


Program should accept 4 input parameters
Colour
Size
Gender
Output Preference 

“Gender” is a String which has two possible values like ‘M’ and ‘F’. M=Male and F=Female.
“Output Preference” is a String which suggests whether the results should be sorted only by Price or by Rating or by both  Price and Rating.




EXPECTED BEHAVIOUR AND OUTPUT:


After getting the inputs, program should search for the T-shirts in the database and list the results on standard output, sorted as per Output Preference.
Program should be written considering that there could be more csv files and at runtime program should load the files. Please make use of Thread which will look for any new file at particular location after some configurable time and load the provided file
If no matching flight is found for the given input, user friendly output should be displayed on the screen.
Maven 3.x should be used
Use the new features of Java 8 wherever possible



Output
Program should display the list of available T-shirts with details on console  for provided user inputs.










