package com.iriand.core.object.tracker.change.DB.entity;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/14/13
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectChangesPackageLog {

    private int id;

    private String objectName;

    private String changesOwner;

    private int objectId;

    private Date date;

    private List<FieldChangesItemLog> fieldChangesItemLogs;

    public ObjectChangesPackageLog(){

    }


    public ObjectChangesPackageLog(String objectName, String changesOwner, int objectId, Date date, List<FieldChangesItemLog> fieldChangesItemLogs) {
        this.objectName = objectName;
        this.changesOwner = changesOwner;
        this.objectId = objectId;
        this.date = date;
        this.fieldChangesItemLogs = fieldChangesItemLogs;
    }

    public int getId() {
        return id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getChangesOwner() {
        return changesOwner;
    }

    public void setChangesOwner(String changesOwner) {
        this.changesOwner = changesOwner;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<FieldChangesItemLog> getFieldChangesItemLogs() {
        return fieldChangesItemLogs;
    }

    public void setFieldChangesItemLogs(List<FieldChangesItemLog> fieldChangesItemLogs) {
        this.fieldChangesItemLogs = fieldChangesItemLogs;
    }
}
