package LoggerItems.entity;

import LoggerItems.LoggerItem;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeField implements LoggerItem {
    private String fieldName;
    private String oldValue;
    private String newValue;

    public ChangeField(String fieldName, String oldValue, String newValue) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public String getAdminName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Date getDate() {
        return new Date();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
