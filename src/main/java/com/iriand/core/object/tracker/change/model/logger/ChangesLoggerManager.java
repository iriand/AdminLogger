package com.iriand.core.object.tracker.change.model.logger;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import org.jetbrains.annotations.NotNull;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 4:32 PM
 */
public interface ChangesLoggerManager {
    @NotNull
    ChangesLoggerManager registerChangesLogger(@NotNull ChangesLogger changesLogger);

    @NotNull
    ChangesLoggerManager logChanges(@NotNull ChangeItemsPackage changeItems);
}
