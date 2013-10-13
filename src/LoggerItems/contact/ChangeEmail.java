package LoggerItems.contact;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class    ChangeEmail {

    private int accountId;
    private String oldEmail;
    private String newEmail;


    public ChangeEmail(int accountId, String oldEmail, String newEmail) {
        this.accountId = accountId;
        this.oldEmail = oldEmail;
        this.newEmail = newEmail;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOldEmail() {
        return oldEmail;
    }

    public String getNewEmail() {
        return newEmail;
    }
}
