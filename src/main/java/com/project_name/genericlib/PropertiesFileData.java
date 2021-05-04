package com.project_name.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Sachin gupta
 *
 */
public class PropertiesFileData implements AutoConstants{
	/**
	 * to get value of key from properties file
	 * @param keyname
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getPropertiesFileData(String keyname) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertiesfilepath));
		return p.getProperty(keyname);
	}

}
