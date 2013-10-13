package com.iriand.core.object.tracker.change.model.logger;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import org.jetbrains.annotations.NotNull;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 3:56 PM
 */
public interface ChangesLogger {
    @NotNull
    ChangesLogger logChanges(@NotNull ChangeItemsPackage changeItems);
}
