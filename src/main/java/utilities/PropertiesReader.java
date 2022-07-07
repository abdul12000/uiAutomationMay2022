package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    //Get the location of the Config.properties files
    File file = new File("src/main/resources/Config.properties");

    //Read the content of the file
    FileInputStream fis = new FileInputStream(file);
public Properties prop = null;


    public PropertiesReader() throws IOException {
        prop = new Properties();
        //Store the content of fis object
        prop.load(fis);
    }

    public String getNewtoursUrl(){
        return prop.getProperty("NewtoursUrl");
    }
    public String getComputerDBUrl(){
        return prop.getProperty("ComputerDatabaseUrl");
    }
}
