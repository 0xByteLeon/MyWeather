package learn.com.myweather.util;

/**
 * Created by MoonlightSW on 2016/1/7.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
