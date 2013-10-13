package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 10:55 AM
 */
public abstract class ChangesItemImpl implements ChangesItem {

    private final Date creationTime = new Date();

    @NotNull
    @Override
    public final Date getCreationTime() {
        return creationTime;
    }
}
