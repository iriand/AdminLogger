package LoggerItems.dao;

import LoggerItems.entity.Account;
import LoggerItems.pkg.LoggerFactory;
import LoggerItems.pkg.LoggerManagerImpl;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountDao {

    public Account update(Account account) {

        Account accountOld = new Account("igal", "yadid");
        accountOld.setEmail(account.getEmail());
        accountOld.setOpid(account.getOpid());

        //em.merge();

        LoggerManagerImpl loggerManager = new LoggerManagerImpl();
//        loggerManager.registerLogger(LoggerFactory.getLogger(SMTP));
//        loggerManager.registerLogger(LoggerFactory.getLogger(MySQL));
//        loggerManager.registerLogger(LoggerFactory.getLogger(QUEUE));
        loggerManager.registerLogger(LoggerFactory.getLogger("consolePrint"));
        loggerManager.print(accountOld.getUpdates());

        return account;
    }
}
