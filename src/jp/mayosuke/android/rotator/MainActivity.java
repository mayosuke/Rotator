package jp.mayosuke.android.rotator;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.view.Menu;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton1);

        try {
            final int accelerometerRotation = android.provider.Settings.System.getInt(getContentResolver(), Settings.System.ACCELEROMETER_ROTATION);
            Log.i(TAG, "accelerometerRotation=" + accelerometerRotation);
            final boolean isAutoRotationEnabled = (accelerometerRotation == 1 ? true : false);
            toggleButton.setChecked(isAutoRotationEnabled);

            final int userRotation = android.provider.Settings.System.getInt(getContentResolver(), Settings.System.USER_ROTATION);
            Log.i(TAG, "userRotation=" + userRotation);
        } catch (SettingNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.i(TAG, "onConfigurationChanged:newConfig=" + newConfig);
        super.onConfigurationChanged(newConfig);
    }
}
