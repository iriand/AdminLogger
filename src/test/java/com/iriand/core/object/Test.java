package com.iriand.core.object;


import com.iriand.core.object.entity.Account;
import com.iriand.core.object.tracker.change.logger.ChangesLoggerManagerImpl;
import com.iriand.core.object.tracker.change.logger.DataBaseChangesLogger;
import com.iriand.core.object.tracker.change.logger.SystemOutChangesLogger;
import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 11:15 AM
 */
@RunWith(JUnit4.class)
public class Test {

        @Rule
        public ExpectedException exception = ExpectedException.none();

        @Before
        public void setUp() throws Exception {

        }

        @After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void testLog() throws Exception {

                    ChangesLoggerManagerImpl changesLoggerManager = (ChangesLoggerManagerImpl) new ChangesLoggerManagerImpl()
                .registerChangesLogger(new SystemOutChangesLogger()).registerChangesLogger(new DataBaseChangesLogger());

            Account account = new Account();
            ChangeItemsPackage itemsPackage = account.logChanges();

            Assert.assertTrue(itemsPackage.isEmpty());

            account.setOpid("andrew");
            account.setOpid("igal");
            account.setOpid("matt");
            account.setOpid("ivan");
            account.setOpid("bublik");
            itemsPackage = account.logChanges("admin");

            Assert.assertTrue(!itemsPackage.isEmpty());
            Assert.assertTrue(itemsPackage.getChangesItems().length == 5);
            Assert.assertTrue(itemsPackage.getChangesOwner().equals("admin"));
           // Assert.assertTrue(itemsPackage.getChangesItems()[0].getChangeOwner().equals(""));

            changesLoggerManager.logChanges(itemsPackage);



    }



//    public static void main(String[] args) {
//
//        ChangesLoggerManagerImpl changesLoggerManager = (ChangesLoggerManagerImpl) new ChangesLoggerManagerImpl()
//                .registerChangesLogger(new SystemOutChangesLogger())
//                .registerChangesLogger(new FileChangesLogger());
//
//        Account account = new Account();
//        account.setOpid("andrew");
//        account.setOpid("igal");
//        account.setOpid("matt");
//        account.setOpid("ivan");
//        account.setOpid("bublik");
//        changesLoggerManager.logChanges(account.logChanges("andrew ben"));
//
//        account.setOpid("matt");
//        changesLoggerManager.logChanges(account.logChanges("igal"));
//        changesLoggerManager.logChanges(account.logChanges());
//
//        Dispatcher dispatcher = new Dispatcher();
//        dispatcher.setEmail("andrew");
//        account.setOpid("matt");
//        changesLoggerManager.logChanges(dispatcher.logChanges("matt"));
//    }
}

