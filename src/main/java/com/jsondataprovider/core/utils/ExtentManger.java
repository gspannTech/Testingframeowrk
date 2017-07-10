package com.jsondataprovider.core.utils;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManger {
	private static ExtentReports extent;
	public static ExtentReports getInstance(){
	 
	 if(extent==null){
	  Date d = new Date();
	  String filename=d.toString().replace(" ", "_").replace(":", "_");
	  
	  String Path = System.getProperty("user.dir")+"//ExtentReports//"+filename+".html";
	  extent = new ExtentReports(Path, false);
	  extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
	 }
	 return extent;
	}
}
