package dfp.cleanCode.log4j;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class TestLog4j {

	@Test
	public void testLogCreate() {

		Logger logger = Logger.getLogger("MyLogger");
		logger.info("hello");
	}

}
