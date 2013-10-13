package com.iriand.core.object;

import com.iriand.core.object.entity.Account;
import com.iriand.core.object.entity.Dispatcher;
import com.iriand.core.object.tracker.change.logger.ChangesLoggerManagerImpl;
import com.iriand.core.object.tracker.change.logger.FileChangesLogger;
import com.iriand.core.object.tracker.change.logger.SystemOutChangesLogger;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 11:15 AM
 */
public class Test {

    public static void main(String[] args) {

        ChangesLoggerManagerImpl changesLoggerManager = (ChangesLoggerManagerImpl) new ChangesLoggerManagerImpl()
                .registerChangesLogger(new SystemOutChangesLogger())
                .registerChangesLogger(new FileChangesLogger());

        Account account = new Account();
        account.setOpid("andrew");
        account.setOpid("igal");
        account.setOpid("matt");
        account.setOpid("ivan");
        account.setOpid("bublik");
        changesLoggerManager.logChanges(account.logChanges("andrew ben"));

        account.setOpid("matt");
        changesLoggerManager.logChanges(account.logChanges("igal"));
        changesLoggerManager.logChanges(account.logChanges());

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setEmail("andrew");
        account.setOpid("matt");
        changesLoggerManager.logChanges(dispatcher.logChanges("matt"));
    }
}

