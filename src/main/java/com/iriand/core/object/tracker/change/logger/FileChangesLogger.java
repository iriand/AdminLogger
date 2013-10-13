package com.iriand.core.object.tracker.change.logger;

import com.iriand.core.object.tracker.change.model.ChangeItemsPackage;
import com.iriand.core.object.tracker.change.model.logger.ChangesLoggerImpl;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * User: Andrew Ben
 * Date: 10/13/13
 * Time: 4:25 PM
 */
public final class FileChangesLogger extends ChangesLoggerImpl {

    @NotNull
    @Override
    public FileChangesLogger logChanges(@NotNull ChangeItemsPackage changeItemsPackage) {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File(changeItemsPackage.getChangesOwner() == null ? "null.txt" : changeItemsPackage.getChangesOwner() + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(changeItemsPackage.toString());

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return this;
    }
}
