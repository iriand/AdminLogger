package com.iriand.core.object.tracker.change.logger;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import com.iriand.core.object.tracker.change.model.logger.ChangesLoggerImpl;
import org.jetbrains.annotations.NotNull;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 4:25 PM
 */
public final class SystemOutChangesLogger extends ChangesLoggerImpl {

    @NotNull
    @Override
    public SystemOutChangesLogger logChanges(@NotNull ChangeItemsPackage changeItemsPackage) {
        try {
            System.out.println(changeItemsPackage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }
}
