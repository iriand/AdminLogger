package com.iriand.core.object.tracker.change.DB.entity;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/13/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class FieldChangesItemLog {

    private int id;

    private String field;

    private String oldValue;

    private String newValue;

    public FieldChangesItemLog(){

    }

    public FieldChangesItemLog(String field, String oldValue, String newValue) {
        this.field = field;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public int getId() {
        return id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
