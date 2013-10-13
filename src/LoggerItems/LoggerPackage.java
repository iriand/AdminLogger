package LoggerItems;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerPackage {

    private Set<LoggerItem> loggerItems;

    private int id;
    private String name;
    private Date timestamp;

    public LoggerPackage(int id, String name, Date timestamp, Set<LoggerItem> loggerItems) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.loggerItems  = new HashSet<LoggerItem>();
        this.loggerItems.addAll(loggerItems);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Set<LoggerItem> getLoggerItems() {
        Set<LoggerItem> result = new HashSet<LoggerItem>();
        result.addAll(loggerItems);
        return result;
    }
}
