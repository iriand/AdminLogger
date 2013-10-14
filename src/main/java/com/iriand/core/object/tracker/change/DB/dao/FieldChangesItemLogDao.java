package com.iriand.core.object.tracker.change.DB.dao;

import com.iriand.core.object.tracker.change.DB.entity.FieldChangesItemLog;
import org.jetbrains.annotations.NotNull;


/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/13/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FieldChangesItemLogDao {

    void save(@NotNull FieldChangesItemLog fieldChangesItemLog);
}
