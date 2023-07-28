package com.ssafy.festival;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FestivalCSVParser {
	
	private String filePath;
	private BufferedReader bufferedReader;
	public List<Festival> festivals;
	private Festival festival;
	private int index;
	
	public FestivalCSVParser(String filePath) throws IOException {
		this.filePath = filePath;
		bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.filePath), "UTF-8"));
		festivals = new ArrayList<>();
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] l = line.split(",");
			System.out.println(line);
			String location = null;
			String name = null;
			String date = null;
			String place = null;
			if (l.length > 1 && l[1] != null) location = l[1].trim();
			if (l.length > 3 && l[3] != null) name = l[1].trim();
			if (l.length > 5 && l[5] != null) date = l[1].trim();
			if (l.length > 6 && l[6] != null) place = l[1].trim();
			festival = new Festival(index++, location, name, date, place);
			festivals.add(festival);
		}
		
	}
	
}
