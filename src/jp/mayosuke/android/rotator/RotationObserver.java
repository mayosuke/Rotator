package jp.mayosuke.android.rotator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class RotationObserver extends BroadcastReceiver {
    private static final String TAG = RotationObserver.class.getSimpleName();

    public static final IntentFilter intentFilter = new IntentFilter() {
        
    };

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive(intent=" + intent + ")");
    }

}
