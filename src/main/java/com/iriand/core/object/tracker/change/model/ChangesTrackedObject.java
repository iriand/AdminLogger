package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.Nullable;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 3:01 PM
 */
public interface ChangesTrackedObject {

    ChangeItemsPackage logChanges();

    ChangeItemsPackage logChanges(@Nullable String changesOwner);
}
