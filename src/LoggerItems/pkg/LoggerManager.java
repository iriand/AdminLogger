package LoggerItems.pkg;

import LoggerItems.LoggerPackage;


/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoggerManager {

    void print(LoggerPackage item);

    void registerLogger(LoggerPackage item);

}
