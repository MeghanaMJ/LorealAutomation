package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class reusableCodes {
	
	public static String getValue(String fileName, String propKey) throws IOException
	{
		Properties prop = new Properties();
		File file=new File(fileName);
		FileInputStream input = new FileInputStream(file.getAbsolutePath());
		prop.load(input);
		return prop.getProperty(propKey);
		
	}

}
