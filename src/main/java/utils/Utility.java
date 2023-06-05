package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	
	public static String getProperty (String key) throws IOException
	{
    File file = new File("src/test/resources/testData.properties");
    FileInputStream fileInputStream = new FileInputStream(file);
    Properties properties = new Properties();
    properties.load(fileInputStream);
   return properties.getProperty(key);
}
}