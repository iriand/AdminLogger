package com.iriand.core.object.tracker.change;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackageBuilderImpl;
import com.iriand.core.object.tracker.change.model.ChangeItemsPackageImpl;
import com.iriand.core.object.tracker.change.model.ChangesItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.List;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 2:01 PM
 */
public final class ObjectChangesPackage extends ChangeItemsPackageImpl {

    @NotNull
    private String objectName;
    private int objectId;

    private ObjectChangesPackage() {
        super();
    }

    private ObjectChangesPackage(@NotNull Date creationTime, @NotNull List<ChangesItem> changesItems) {
        super(creationTime, changesItems, null);
    }

    public ObjectChangesPackage(Date creationTime, List<ChangesItem> changesItems, @Nullable String changesOwner) {
        super(creationTime, changesItems, changesOwner);
    }

    @NotNull
    public String getObjectName() {
        return objectName;
    }

    public int getObjectId() {
        return objectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectChangesPackage [")
                .append(objectName)
                .append(": ")
                .append(objectId)
                .append("] by ")
                .append(getChangesOwner())
                .append(": \n");

        if (this.isEmpty()) {
            sb.append("\tEMPTY PACKAGE\n");
        } else {
            final ChangesItem[] changesItems = this.getChangesItems();
            for (ChangesItem changesItem : changesItems) {
                sb.append("\t")
                        .append(changesItem)
                        .append("\n");
            }
        }

        sb.append("\n");

        return sb.toString();
    }

    public static class ObjectChangesPackageBuilder extends ChangeItemsPackageBuilderImpl {
        @NotNull
        private String objectName;
        private int objectId;
        @Nullable
        private String changesOwner;

        public ObjectChangesPackageBuilder(@NotNull String objectName, int objectId) {
            this.objectName = objectName;
            this.objectId = objectId;
        }

        public ObjectChangesPackageBuilder setChangesOwner(@Nullable String changesOwner) {
            this.changesOwner = changesOwner;
            return this;
        }

        public ObjectChangesPackage build() {
            ObjectChangesPackage objectChangesPackage = new ObjectChangesPackage(this.creationTime, this.changesItems, this.changesOwner);

            objectChangesPackage.objectName = this.objectName;
            objectChangesPackage.objectId = this.objectId;

            return objectChangesPackage;
        }
    }
}
