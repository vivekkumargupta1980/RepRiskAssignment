package com.java.reprisk.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private static final String PATH_TO_CSV = "C:\\Users\\Vivek\\Downloads\\RepRisk\\160408_company_list.csv";
	private List<Company> companies = new ArrayList<>();
	public static void main(String[] args) {
		processCSVFile();
	}

	private static void processCSVFile() {
		try(BufferedReader csvReader = new BufferedReader(new FileReader(PATH_TO_CSV))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(";", 2);
				if (isInteger(data[0])) {
					createCompanies(Long.valueOf(data[0]), data[1]);
				}
				
				//System.out.println(Arrays.deepToString(data));
			}
		} catch (IOException ex) {
			System.err.println("Exception while reading file from path - " + PATH_TO_CSV);
			ex.printStackTrace();
		} 
	}
	
	private static void createCompanies(long companyId, String companyName) {
		//String [] additionalInformatiom = companyName.split("\\(([^)]+)\\)");
		//System.out.println(Arrays.deepToString(additionalInformatiom));
		if (companyName.matches("\\(([)]+)\\)") ) {
			String [] additionalInformatiom = companyName.split("\\(([)]+)\\)");
			System.out.println(Arrays.deepToString(additionalInformatiom));
		} else if (companyName.contains(";")) {
			
		}
		//Company company = new Company(companyId, comanyName, additionalInformatiom)
	}
	
	public static boolean isInteger(String companyId) {
	    try { 
	    	Long.valueOf(companyId); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
	}
}
