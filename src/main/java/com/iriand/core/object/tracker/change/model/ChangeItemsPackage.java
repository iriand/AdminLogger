package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 1:48 PM
 */
public interface ChangeItemsPackage {

    @NotNull
    ChangesItem[] getChangesItems();

    @NotNull
    Date getCreationTime();

    @Nullable
    String getChangesOwner();

    boolean isEmpty();
}
