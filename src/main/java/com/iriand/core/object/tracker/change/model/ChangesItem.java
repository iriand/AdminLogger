package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 10:51 AM
 */

public interface ChangesItem {
    @Nullable
    String getChangeOwner();

    @NotNull
    Date getCreationTime();
}
