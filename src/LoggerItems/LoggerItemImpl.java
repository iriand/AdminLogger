package LoggerItems;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerItemImpl implements LoggerItem {

    private String adminName;

    public LoggerItemImpl() {

    }

    public String getAdminName() {
        return adminName;
    }

    public Date getDate() {
        return new Date();
    }


}
