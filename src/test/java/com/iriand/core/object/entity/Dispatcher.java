package com.iriand.core.object.entity;

import com.iriand.core.object.tracker.change.model.ChangesTrackedObjectImpl;
import org.jetbrains.annotations.NotNull;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 2:55 PM
 */
public final class Dispatcher extends ChangesTrackedObjectImpl {

    private String email;

    public String getEmail() {
        return email;
    }

    @NotNull
    public Dispatcher setEmail(String email) {
        logChange("email", this.email, email);
        this.email = email;
        return this;
    }
}

