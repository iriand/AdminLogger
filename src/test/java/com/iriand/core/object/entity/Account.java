package com.iriand.core.object.entity;

import com.iriand.core.object.tracker.change.model.ChangesTrackedObjectImpl;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 2:29 PM
 */
public final class Account extends ChangesTrackedObjectImpl {
    private String opid;

    public String getOpid() {
        return opid;
    }

    public Account setOpid(String opid) {
        logChange("opid", this.opid, opid);

        this.opid = opid;
        return this;
    }
}
