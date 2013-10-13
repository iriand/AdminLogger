package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 1:55 PM
 */
public abstract class ChangeItemsPackageImpl implements ChangeItemsPackage {

    @NotNull
    private final List<ChangesItem> changesItems = new ArrayList<ChangesItem>();
    @NotNull
    private final Date creationTime;
    @Nullable
    private String changesOwner;

    protected ChangeItemsPackageImpl() {
        this.creationTime = new Date();
    }

    protected ChangeItemsPackageImpl(@NotNull Date creationTime, @NotNull List<ChangesItem> changesItems, @Nullable String changesOwner) {
        this.creationTime = creationTime;
        this.changesItems.addAll(changesItems);
        this.changesOwner = changesOwner;
    }

    /**
     * Get list of changed items. It is immutable object.
     *
     * @return Clone of the list of changed items.
     */
    @NotNull
    public final ChangesItem[] getChangesItems() {
        ChangesItem[] result = new ChangesItem[changesItems.size()];
        changesItems.toArray(result);
        return result;
    }

    @NotNull
    public final Date getCreationTime() {
        return this.creationTime;
    }

    @Nullable
    public String getChangesOwner() {
        return changesOwner;
    }

    @Override
    public boolean isEmpty() {
        return changesItems.size() == 0;
    }
}
