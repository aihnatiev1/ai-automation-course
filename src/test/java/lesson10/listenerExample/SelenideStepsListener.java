package lesson10.listenerExample;

import com.codeborne.selenide.logevents.LogEvent;
import com.codeborne.selenide.logevents.LogEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class SelenideStepsListener implements LogEventListener {

    private final Logger logger = LoggerFactory.getLogger(SelenideStepsListener.class);

    private String stepUUID;

    @Override
    public void beforeEvent(LogEvent currentLog) {
        stepUUID = UUID.randomUUID().toString();
        logger.info("{}: {} ......{}", currentLog.getElement(), currentLog.getSubject(), currentLog.getStatus());
    }

    @Override
    public void afterEvent(LogEvent currentLog) {
        logger.info("{}: {} ......{}", currentLog.getElement(), currentLog.getSubject(), currentLog.getStatus());
    }
}
