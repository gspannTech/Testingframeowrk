package com.jsondataprovider.core.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonReader {
	
static String filename = "credJson.json";
static String absoluteFilePath = System.getProperty("user.dir") + File.separator + "src\\test\\resources\\jsonfiles"+File.separator+filename;
static int rows;
static int colm;
static List<Object>list = new ArrayList<Object>();
static List<String>list2 = new ArrayList<String>();
static Object[][] objArray = null;
 
	 
 public static Object[][] readJson()throws Exception {
			
		JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader(absoluteFilePath));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
           colm = jsonObject.size();
			int i = 1;
			boolean keys = true;
			while (keys) {
				// for(int i=1;i<=3;i++){
				JSONArray msg = (JSONArray) jsonObject.get("messages" + i);
				rows = msg.size();
				//System.out.println(msg.size());
			
				Iterator<String> iterator = msg.iterator();
				while (iterator.hasNext()) {
					Object txt = iterator.next();
					//System.out.println(iterator.next().toString());
					list.add(txt);
				}
				i = i +1;
				keys = jsonObject.containsKey("messages"+i);
			}
			for(Object obj1 : list){
				list2.add(obj1.toString());
			}
			for(String str : list2){
				System.out.println(str);
			}
		
			objArray = new Object[rows][colm];
			int count=0;
				for (int j = 0; j < rows; j++) {
					for (int k = 0; k < colm; k++) {
						objArray[j][k] = list2.get(count);
						count=count+1;
					}
				}			
			
			//for printing the number of rows
			for(Object[] printrow : objArray) {
				  for (Object print : printrow) {
		                System.out.print(print.toString());
		                System.out.print("\t");
		            }
		            System.out.println();
	        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return (objArray);

    }

		
	}
	
	


