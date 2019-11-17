package com.areteans.library.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;


public class TestDataClass {

	@DataProvider(name = "setData")
	public static Object[][] testDataGen() {

		Object data[][] = new Object[1][1];
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = null;
	
		try {
			
			
			String iterations = ExcelUtility.getDataSetID();
			System.out.println("iterations = "+ iterations );
			if(!iterations.trim().equals("0"))
			{
			for (String eachIt : iterations.split(",")) {
				map=ExcelUtility.getTestData(Integer.parseInt(eachIt));
				list.add(map);
			}
			data[0][0] = list;
			}
		} catch (Exception e) {
				e.printStackTrace();
			}

		finally {
			
			System.out.println("code to close connections....!!!!");
		}

		return data;

	}

}
