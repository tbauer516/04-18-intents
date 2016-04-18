package edu.uw.intentdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by tbauer516 on 4/18/16.
 */
public class MyReceiver extends BroadcastReceiver {

    private static String TAG = "Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Received: " + intent);

        switch (intent.getAction()) {
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "Battery is low!", Toast.LENGTH_SHORT).show();
                return;

            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "Power Connected!", Toast.LENGTH_SHORT).show();
                return;

            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "Power Connected!", Toast.LENGTH_SHORT).show();
                return;
        }

    }
}
