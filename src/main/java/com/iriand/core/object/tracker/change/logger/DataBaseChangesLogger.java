package com.iriand.core.object.tracker.change.logger;

import com.iriand.core.object.tracker.change.DB.dao.FieldChangesItemLogDao;
import com.iriand.core.object.tracker.change.DB.dao.FieldChangesItemLogDaoImpl;
import com.iriand.core.object.tracker.change.DB.dao.ObjectChangesPackageLogDao;
import com.iriand.core.object.tracker.change.DB.dao.ObjectChangesPackageLogDaoImpl;
import com.iriand.core.object.tracker.change.DB.entity.FieldChangesItemLog;
import com.iriand.core.object.tracker.change.DB.entity.ObjectChangesPackageLog;
import com.iriand.core.object.tracker.change.FieldChangesItem;
import com.iriand.core.object.tracker.change.ObjectChangesPackage;
import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import com.iriand.core.object.tracker.change.model.ChangesItem;
import com.iriand.core.object.tracker.change.model.logger.ChangesLogger;
import com.iriand.core.object.tracker.change.model.logger.ChangesLoggerImpl;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/14/13
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataBaseChangesLogger extends ChangesLoggerImpl {

    @NotNull
    @Override
    public ChangesLogger logChanges(@NotNull ChangeItemsPackage changeItems) {
        try {

            FieldChangesItemLogDao itemLogDao = new FieldChangesItemLogDaoImpl();
            ObjectChangesPackageLogDao objectChangesPackageLogDao = new ObjectChangesPackageLogDaoImpl();

            ObjectChangesPackageLog objectChangesPackageLog = new ObjectChangesPackageLog();
            objectChangesPackageLog.setChangesOwner(changeItems.getChangesOwner());
            objectChangesPackageLog.setDate(changeItems.getCreationTime());
            if (changeItems instanceof ObjectChangesPackage) {
                objectChangesPackageLog.setObjectName(((ObjectChangesPackage) changeItems).getObjectName());
                objectChangesPackageLog.setObjectId(((ObjectChangesPackage) changeItems).getObjectId());
            }

            List<FieldChangesItemLog> fieldChangesItems = new ArrayList<FieldChangesItemLog>();
            for (ChangesItem item : changeItems.getChangesItems()) {
                if (item instanceof FieldChangesItem) {
                    FieldChangesItem changesItem = (FieldChangesItem) item;
                    FieldChangesItemLog log = new FieldChangesItemLog(changesItem.getFieldName(), (String) changesItem.toString(), (String) changesItem.getNewValue());
                    fieldChangesItems.add(log);

                   // itemLogDao.save(log);
                }

            }
            objectChangesPackageLog.setFieldChangesItemLogs(fieldChangesItems);
            objectChangesPackageLogDao.save(objectChangesPackageLog);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
}
