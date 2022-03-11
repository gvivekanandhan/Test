package MavenDay1;

import org.apache.logging.log4j.*;

public class Log4jDemo {
	
	public static final Logger Log = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		Log.debug("This is my debug message");
		Log.info("This is my info message");
		Log.warn("This is my warn message");
		Log.error("This is my error message");
		Log.fatal("This is my fatal message");
	}

}
