package com.example.babyoralhealth;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	/*public static List<Baby> babyList = new ArrayList<Baby>();
	
	public static void readData(File baby_file){
		try {
			Scanner sc = new Scanner(baby_file);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void readPatients(File patient_file){
		try {
			Scanner sc = new Scanner(patient_file);
			
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] babyData = data.split(",");
				babyData[4].substring(1, babyData[4].length() - 1).split(";")
				babyList.add(new Baby(babyData[0], babyData[1], babyData[2], babyData[3], ))

			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveData(File baby_file){
		try{
			BufferedWriter br = new BufferedWriter(new FileWriter(
					patient_file));
			for (int i = 0; i < babyList.size(); i ++){
				br.write(writeBabyData(patientList.get(i)));
				br.newLine();
			}
		    br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String writeBabyData(Baby p){
		String docVisit = "";
		if (p.getDVisit() == null){
			docVisit = "null";
		}
		else{
			docVisit = p.getDVisit().getDTimeDate();
		}
		return p.getHealthCardNumber() + ',' + p.getName() + 
				',' + p.getBirthDate() + "," + vListData(p) + "," +
				sListData(p) + "," + mListData(p) + "," +
				p.getArrivalTime() + "," + docVisit;
	}*/
}
	
