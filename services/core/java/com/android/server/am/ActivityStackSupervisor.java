package com.android.server.am;

import android.os.IBinder;

public abstract class ActivityStackSupervisor implements IBinder {

    // 26+
    void cleanUpRemovedTaskLocked(TaskRecord tr, boolean killProcess, boolean removeFromRecents) {
        try {
            cleanUpRemovedTaskLocked$Pr(tr, killProcess, removeFromRecents);
        } finally {
            if (killProcess) {
                PreventRunningUtils.onCleanUpRemovedTask(tr.getBaseIntent());
            }
        }
    }

    private void cleanUpRemovedTaskLocked$Pr(TaskRecord tr, boolean killProcess, boolean removeFromRecents) {
        throw new UnsupportedOperationException();
    }
}
