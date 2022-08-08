package com.cg.datasource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Data_Source_Example {


	private static Properties createDefaultProperties() {

		Properties tempProp = new Properties();
		/* Database connection parameter properties are set */
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with mysql server: 
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		return tempProp;
	}

	private static void printProperties(Properties p, String s) {
		System.out.println();
		System.out.println("========================================");
		System.out.println(s);
		System.out.println("========================================");
		System.out.println("+---------------------------------------+");
		System.out.println("| Print Application Properties          |");
		System.out.println("+---------------------------------------+");
		p.list(System.out);
		System.out.println();
	}

	private static void saveProperties(Properties p, String fileName) {
		OutputStream propsFile;

		try {
			propsFile = new FileOutputStream(fileName);
			p.store(propsFile, "Properties File to the Test Application");
			propsFile.close();
		} catch (IOException ioe) {
			System.out.println("I/O Exception.");
			ioe.printStackTrace();
			System.exit(0);
		}

	}

	private static Properties loadProperties(String fileName) {

		InputStream propsFile;
		Properties tempProp = new Properties();

		try {
			propsFile = new FileInputStream(fileName);
			tempProp.load(propsFile);
			propsFile.close();
		} catch (IOException ioe) {
			System.out.println("I/O Exception.");
			ioe.printStackTrace();
			System.exit(0);
		}
		return tempProp;
	}

	private static Properties alterProperties(Properties p) {

		Properties newProps = new Properties();
		Enumeration enProps = p.propertyNames();
		String key = "";

		while (enProps.hasMoreElements()) {

			key = (String) enProps.nextElement();

			/* If we want to alter the username property 
			can be set to new username and also for all 
			 the other properties*/

			if (key.equals("username")) {
				newProps.setProperty(key, "scott");

			} else {
				newProps.setProperty(key, p.getProperty(key));
			}

		}
		return newProps;
	}

	
	public static void main(String[] args) {

		final String PROPFILE = "MyApplication.properties";
		Properties myProp;
		Properties myNewProp;

		myProp = createDefaultProperties();
		printProperties(myProp, "Newly Created (Default) Properties");
		saveProperties(myProp, PROPFILE);
		myNewProp = loadProperties(PROPFILE);
		printProperties(myNewProp, "Loaded Properties");
		myNewProp = alterProperties(myProp);
		printProperties(myNewProp, "After Altering Properties");
		saveProperties(myNewProp, PROPFILE);
		Properties myNewProp1 = loadProperties(PROPFILE);
		Enumeration enProps = myNewProp1.propertyNames();
		String key = "";//local key variable
		String param[]; //String array to read properties.
		param = new String[4];
		int i = 0;
		while (enProps.hasMoreElements()) {
			key = (String) enProps.nextElement();
			System.out.println(key);
			param[i] = (String) myNewProp1.getProperty(key);
			System.out.println("  " + key + "  ->  "
					+ myNewProp1.getProperty(key));
			i++;
		}

	}
}


