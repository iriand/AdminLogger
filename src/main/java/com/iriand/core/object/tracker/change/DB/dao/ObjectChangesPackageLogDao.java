package com.iriand.core.object.tracker.change.DB.dao;

import com.iriand.core.object.tracker.change.DB.entity.ObjectChangesPackageLog;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/14/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ObjectChangesPackageLogDao {

    void save(@NotNull ObjectChangesPackageLog objectChangesPackageLog);
}
