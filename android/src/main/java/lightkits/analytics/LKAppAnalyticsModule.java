package lightkits.analytics;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;

public class LKAppAnalyticsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    private FirebaseAnalytics mFirebaseAnalytics;

    public LKAppAnalyticsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this.getCurrentActivity());
    }

    @Override
    public String getName() {
        return "LKAppAnalytics";
    }

    @ReactMethod
    public void setCurrentScreen(String screenName) {
        mFirebaseAnalytics.setCurrentScreen(this.getCurrentActivity(), screenName, null);
    }

    @ReactMethod
    public void logEvent(String evenName, @Nullable ReadableMap params) {
        mFirebaseAnalytics.logEvent(evenName, Arguments.toBundle(params));
    }
}
