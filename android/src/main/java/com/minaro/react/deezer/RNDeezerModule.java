
package com.minaro.react.deezer;

import android.util.Log;
import android.content.Context;

import com.deezer.sdk.network.connect.SessionStore;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;


import com.deezer.sdk.network.connect.DeezerConnect;
import com.deezer.sdk.network.connect.SessionStore;


public class RNDeezerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDeezerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNDeezer";
  }

  @ReactMethod
  public void getDeviceName(Callback cb) {
         try{
             cb.invoke(null, android.os.Build.MODEL);
         }catch (Exception e){
             cb.invoke(e.toString(), null);
         }
     }

    public static final String applicationID = "364784";
    private static final String TAG = "DeezerHelper";

    public void initialize(Context context) {
        DeezerConnect deezerConnect = new DeezerConnect(context, applicationID);
    }
}
