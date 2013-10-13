package LoggerItems.contact;

import LoggerItems.LoggerItemImpl;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeOpidItem extends LoggerItemImpl {
    private int accountId;
    private String oldOpid;
    private String newOpid;

    public ChangeOpidItem(int accountId, String oldOpid, String newOpid){
        this.accountId = accountId;
        this.oldOpid = oldOpid;
        this.newOpid = newOpid;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOldOpid() {
        return oldOpid;
    }

    public String getNewOpid() {
        return newOpid;
    }
}
