package hospital.util;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LogTestUtil {

    private static final List<String> logMessages = new ArrayList<>();
    private static Appender testAppender;

    public static void setupLogCapturing(String loggerName) {
        logMessages.clear();

        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        Logger logger = context.getLogger(loggerName);

        testAppender = new AbstractAppender("TestAppender", null,
                PatternLayout.newBuilder().withPattern("%m").build(), false) {
            @Override
            public void append(LogEvent event) {
                logMessages.add(event.getMessage().getFormattedMessage());
            }
        };
        testAppender.start();
        logger.addAppender(testAppender);
    }

    public static void tearDownLogCapturing(String loggerName) {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        Logger logger = context.getLogger(loggerName);

        if (testAppender != null) {
            logger.removeAppender(testAppender);
            testAppender.stop();
        }
    }

    public static List<String> getLogMessages() {
        return logMessages;
    }

    public static boolean containsLog(String expectedMessage) {
        return logMessages.stream().anyMatch(msg -> msg.contains(expectedMessage));
    }
}

