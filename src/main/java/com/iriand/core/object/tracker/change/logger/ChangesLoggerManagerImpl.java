package com.iriand.core.object.tracker.change.logger;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import com.iriand.core.object.tracker.change.model.logger.ChangesLogger;
import com.iriand.core.object.tracker.change.model.logger.ChangesLoggerManager;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 4:33 PM
 */
public final class ChangesLoggerManagerImpl implements ChangesLoggerManager {

    List<ChangesLogger> changesLoggers = new ArrayList<ChangesLogger>();

    @NotNull
    @Override
    public ChangesLoggerManager registerChangesLogger(@NotNull ChangesLogger changesLogger) {
        try {
            changesLoggers.add(changesLogger);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @NotNull
    @Override
    public ChangesLoggerManager logChanges(@NotNull ChangeItemsPackage changeItems) {
        try {
            if (!changeItems.isEmpty()) {
                for (ChangesLogger changesLogger : changesLoggers) {
                    changesLogger.logChanges(changeItems);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }
}
