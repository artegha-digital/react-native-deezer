package com.minaro.react.deezer;

import android.os.Bundle;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import com.deezer.sdk.network.connect.DeezerConnect;
import com.deezer.sdk.network.connect.event.DialogListener;

import com.deezer.sdk.model.Permissions;


public class DeezerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public DeezerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Deezer";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    @ReactMethod
    public void getModuleName(Callback callback) {
        callback.invoke("Hello Deezer");
    }

    @ReactMethod
    public void authenticate(final Promise promise) {
        String applicationID = "364784";
        DeezerConnect deezerConnect = new DeezerConnect(applicationID);

        // the request listener
        String[] permissions = new String[] {
                Permissions.BASIC_ACCESS,
                Permissions.MANAGE_LIBRARY,
                Permissions.LISTENING_HISTORY
        };

        // The listener for authentication events
        DialogListener listener = new DialogListener() {

            public void onComplete(Bundle values) {
                promise.resolve(true);
            }

            public void onCancel() {
                promise.resolve(false);
            }

            public void onException(Exception e) {
                promise.resolve(false);
            }
        };

        // Launches the authentication process
        deezerConnect.authorize(this.getCurrentActivity(), permissions, listener);
    }
}
