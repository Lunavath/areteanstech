package com.areteans.library.drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.areteans.library.utils.GlobalVariables;

public class Config {
	
	private static Map<String, String> env_Var=new HashMap<String, String>();
	
	public static String getProperty(String key) {
		return env_Var.get(key);
	}
	
	public static void setPropertyFile() {
		
		if(env_Var!=null) {
		
			FileInputStream in;
			try {
				in = new FileInputStream(GlobalVariables.appPropFilePath);
				Properties props = new Properties();
				props.load(in);
				
				Set<Object> st = props.keySet();
				for(Object obj:st) {
					env_Var.put(obj.toString(), props.get(obj).toString());
				}
				
				in.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} 

}
