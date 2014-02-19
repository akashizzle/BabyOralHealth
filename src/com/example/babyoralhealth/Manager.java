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
	public static List<Baby> babyList = new ArrayList<Baby>();
		
	public static void readData(File baby_file){
		try {
			Scanner sc = new Scanner(baby_file);		
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] babyData = data.split(",");
				String [] StrBabyData = babyData[4].substring(1, babyData[4].length() - 1).split(";");
				List <String> SBabyData = new ArrayList<String>();				
				for (int i = 0; i < StrBabyData.length; i ++){
					SBabyData.add(StrBabyData[i]);
				}
				babyList.add(new Baby(babyData[0], babyData[1], babyData[2], babyData[3], SBabyData));
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Baby> getBabyList() {
		return babyList;
	}

	public static void setBabyList(List<Baby> babyList) {
		Manager.babyList = babyList;
	}

	public static void saveData(File baby_file){
		try{
			BufferedWriter br = new BufferedWriter(new FileWriter(
					baby_file));
			for (int i = 0; i < babyList.size(); i ++){
				br.write(writeBabyData(babyList.get(i)));
				br.newLine();
			}
		    br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String writeBabyData(Baby b){
		String retrnValue = "[";
		for (int i = 0; i < b.getTraits().size(); i ++){
			retrnValue += b.getTraits().get(i) + ";";
		}
		return b.getAge() + "," + b.getTeeth() + "," + b.getDentist() + "," + b.getLastVisit() +
				"," + retrnValue.substring(0, retrnValue.length() - 1) + "]";
	}
}
