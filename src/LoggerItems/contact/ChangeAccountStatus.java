package LoggerItems.contact;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeAccountStatus {

    private int accountId;
    //TODO: change to enum
    private String oldStatus;
    private String newStatus;


    public ChangeAccountStatus(int accountId, String oldStatus, String newStatus) {
        this.accountId = accountId;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }
}
