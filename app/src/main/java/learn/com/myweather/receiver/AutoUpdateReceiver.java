package learn.com.myweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import learn.com.myweather.service.AutoUpdateService;

/**
 * Created by MoonlightSW on 2016/1/28.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
