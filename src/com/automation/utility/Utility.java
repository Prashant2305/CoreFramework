package com.automation.utility;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
	
	public static Properties readPropertyFile(FileReader filereader) throws IOException  {
		Properties prop = new Properties();
		prop.load(filereader);
		return prop;
	}

}
