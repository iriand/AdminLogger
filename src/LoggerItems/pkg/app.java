package LoggerItems.pkg;

import LoggerItems.dao.AccountDao;
import LoggerItems.entity.Account;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class app {

     public static void main(String [ ] args){

        // LoggerFactory loggerFactory = LoggerFactory.getLogger(new ChangeOpidItem(accountId, "sdf", "ff"));

         Account account = new Account("eee", "yyyy");
         AccountDao dao = new AccountDao();
         dao.update(account);

        //  System.out.println("Hi");

     }
}
