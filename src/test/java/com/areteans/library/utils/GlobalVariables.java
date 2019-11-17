package com.areteans.library.utils;

public class GlobalVariables {

	public final static String runManagerExlPath = System.getProperty("user.dir") + "\\TestData\\RunManager.xlsx";
	public final static String testDataExlPath = System.getProperty("user.dir") + "\\TestData\\TestData.xlsx";
	public final static String log4jPropFilePath = System.getProperty("user.dir") + "\\log4j.properties";
	public final static String appPropFilePath = System.getProperty("user.dir") + "\\application.properties";
	
	public final static String runManagerExlSheetName = "RunManager";
	public final static String testDataExlSheetName = "TestData";

	public static String currentMethodNameForData="";
		
	public static final long maxTimeLoad = 30;

	public static String currentTestResultsPath;
	public static String currentTestPath;
	public static String currentTestlogPath;
	public static String currentscreenshotPath;
	public static String currentTestName;
	public static String currentTestCaseName;

}
