package com.iriand.core.object.tracker.change.model;

import org.jetbrains.annotations.NotNull;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 2:20 PM
 */
public interface ChangeItemsPackageBuilder {
    ChangeItemsPackageBuilder addChangeItem(@NotNull ChangesItem changesItem);

//    Class <? extends ChangeItemsPackageImpl> build();
}
