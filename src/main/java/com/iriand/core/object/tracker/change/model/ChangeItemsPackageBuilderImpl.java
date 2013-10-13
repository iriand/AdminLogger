package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 1:55 PM
 */
public abstract class ChangeItemsPackageBuilderImpl implements ChangeItemsPackageBuilder {

    @NotNull
    protected final List<ChangesItem> changesItems = new ArrayList<ChangesItem>();
    @NotNull
    protected final Date creationTime = new Date();

    @NotNull
    @Override
    public ChangeItemsPackageBuilder addChangeItem(@NotNull ChangesItem changesItem) {
        changesItems.add(changesItem);
        return this;
    }

//    public abstract Class<? extends ChangeItemsPackageImpl> build();
}
