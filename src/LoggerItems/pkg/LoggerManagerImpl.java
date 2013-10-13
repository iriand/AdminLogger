package LoggerItems.pkg;

import LoggerItems.LoggerPackage;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public final class LoggerManagerImpl implements LoggerManager {

    Set<Logger> loggers = new HashSet<Logger>();

    public void print(LoggerPackage item) {

        for (Logger logger : loggers) {
            logger.print(item);
        }
    }

    public void registerLogger(LoggerPackage item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void registerLogger(Logger logger) {
        if (logger != null) {
            loggers.add(logger);
        }
    }
}
