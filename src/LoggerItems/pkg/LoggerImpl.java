package LoggerItems.pkg;

import LoggerItems.LoggerItem;
import LoggerItems.LoggerPackage;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerImpl implements Logger  {

    public void print(LoggerPackage loggerItem) {

        System.out.println("id:" + loggerItem.getId() + " class name:" +loggerItem.getName());
        for(LoggerItem item: loggerItem.getLoggerItems()){
            System.out.println("Date:" +item.getDate().toString() +" admin:" +item.getAdminName() );
        }

    }
}
