package LoggerItems.entity;

import LoggerItems.LoggerItem;
import LoggerItems.LoggerPackage;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Account {

    Set<LoggerItem> updatedFields = new HashSet<LoggerItem>();

    private String opid;
    private String email;

    public Account(String email, String opid){
        this.email =email;
        this.opid = opid;

    }

    public String getOpid() {
        return opid;
    }

    public void setOpid(String opid) {
        if (this.opid != null && !opid.equals(this.opid)) { //todo
            updatedFields.add(new ChangeField("fieldName", "oldValue", "newValue"));
        }
        this.opid = opid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(this.getEmail() != null && !email.equals(this.getEmail()))
            updatedFields.add(new ChangeField("fieldName", "oldValue", "newValue"));
        this.email = email;
    }

    public LoggerPackage getUpdates() {

       // Set<LoggerItem> updates = new HashSet<LoggerItem>();
       // updates.addAll(this.updatedFields);
       // updatedFields.clear();
        return new LoggerPackage(1, this.getClass().getName(), new Date(), updatedFields);
    }
}
