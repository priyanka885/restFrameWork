package loggerUtil;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogManager {
	
	public static Logger logger() {
		Logger log=Logger.getLogger(LogManager.class);
		PropertyConfigurator.configure(".\\src\\test\\resource\\log4j.properties");
		return log;
	}

}
