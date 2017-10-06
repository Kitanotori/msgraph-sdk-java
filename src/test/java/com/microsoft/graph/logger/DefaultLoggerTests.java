package com.microsoft.graph.logger;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test cases for {@see DefaultLogger}
 */
public class DefaultLoggerTests {

	@Test
    public void testLoggerLevel(){
        ILogger logger = new DefaultLogger();
        assertEquals(LoggerLevel.Error, logger.getLoggingLevel());
        logger.setLoggingLevel(LoggerLevel.Debug);
        assertEquals(LoggerLevel.Debug, logger.getLoggingLevel());
    }
}
