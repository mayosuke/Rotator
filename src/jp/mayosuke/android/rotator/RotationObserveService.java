package jp.mayosuke.android.rotator;

import android.app.IntentService;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;

public class RotationObserveService extends IntentService {
    private static final String TAG = RotationObserveService.class.getSimpleName();

    public RotationObserveService(String name) {
        super(name);
        Log.i(TAG, "RotationObserveService:name=" + name);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "onHandleIntent:intent=" + intent);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.i(TAG, "onConfigurationChanged:newConfig=" + newConfig);
    }

}
