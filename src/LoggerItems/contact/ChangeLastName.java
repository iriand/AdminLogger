package LoggerItems.contact;

import LoggerItems.LoggerItemImpl;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeLastName extends LoggerItemImpl {

    private int accountId;
    private String oldName;
    private String newName;


    public ChangeLastName(int accountId, String oldName, String newName) {
        this.accountId = accountId;
        this.oldName = oldName;
        this.newName = newName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOldName() {
        return oldName;
    }

    public String getNewName() {
        return newName;
    }
}
