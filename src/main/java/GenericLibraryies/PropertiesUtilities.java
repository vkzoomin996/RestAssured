package GenericLibraryies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilities {
 private Properties property;
	public void propertiesInitialization(String filepath) {
		  property= new Properties();
		  
				try {
					property.load(new FileInputStream(filepath));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		  
	}
	public String fetchParameter(String key) {
		return  property.getProperty(key);
	}
}
