package com.iriand.core.object.tracker.change.model;

import com.iriand.core.object.tracker.change.FieldChangesItem;
import com.iriand.core.object.tracker.change.ObjectChangesPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 2:56 PM
 */
public abstract class ChangesTrackedObjectImpl implements ChangesTrackedObject {
    protected ObjectChangesPackage.ObjectChangesPackageBuilder changesPackageBuilder = new ObjectChangesPackage.ObjectChangesPackageBuilder(this.getClass().getName(), -1);

    public ChangeItemsPackage logChanges() {
        return logChanges(null);
    }

    @Override
    public ChangeItemsPackage logChanges(@Nullable String changesOwner) {
        final ObjectChangesPackage pack = (ObjectChangesPackage) changesPackageBuilder.setChangesOwner(changesOwner).build();

        this.changesPackageBuilder = new ObjectChangesPackage.ObjectChangesPackageBuilder(this.getClass().getName(), -1);
        return pack;
    }

    private boolean isDifferent(@Nullable Object oldValue, @Nullable Object newValue) {
        return true; //todo
    }

    protected void logChange(@NotNull String name, @Nullable Object oldValue, @Nullable Object newValue) {
        try {
            if (isDifferent(oldValue, newValue)) {
                changesPackageBuilder.addChangeItem(new FieldChangesItem.FieldChangeItemBuilder(name, oldValue, newValue).build());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
