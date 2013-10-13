package com.iriand.core.object.tracker.change;

import com.iriand.core.object.tracker.change.model.ChangesItemImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 11:00 AM
 */
public final class FieldChangesItem extends ChangesItemImpl {

    @NotNull
    private String fieldName;
    @Nullable
    private Object oldValue;
    @Nullable
    private Object newValue;
    @Nullable
    private String changeOwner;

    private FieldChangesItem() {
    }

    @Nullable
    @Override
    public String getChangeOwner() {
        return null;
    }

    @NotNull
    public String getFieldName() {
        return fieldName;
    }

    @Nullable
    public Object getOldValue() {
        return oldValue;
    }

    @Nullable
    public Object getNewValue() {
        return newValue;
    }

    @Override
    public String toString() {
        return "FieldChangesItem{" +
                "fieldName='" + fieldName + "\' by " + changeOwner + ": " + oldValue + " => " + newValue + '}';
    }

    public static class FieldChangeItemBuilder {
        @NotNull
        private String fieldName;
        @Nullable
        private Object oldValue;
        @Nullable
        private Object newValue;
        @Nullable
        private String changeOwner;

        public FieldChangeItemBuilder(@NotNull String fieldName, @Nullable Object oldValue, @Nullable Object newValue) {
            this.fieldName = fieldName;
            this.oldValue = oldValue;
            this.newValue = newValue;
        }

        public FieldChangeItemBuilder setChangeOwner(@Nullable String changeOwner) {
            this.changeOwner = changeOwner;
            return this;
        }

        public FieldChangesItem build() {
            FieldChangesItem fieldChangeItem = new FieldChangesItem();
            fieldChangeItem.fieldName = this.fieldName;
            fieldChangeItem.oldValue = this.oldValue;
            fieldChangeItem.newValue = this.newValue;

            fieldChangeItem.changeOwner = this.changeOwner;

            return fieldChangeItem;
        }
    }
}
