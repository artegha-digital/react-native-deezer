package com.minaro.react.deezer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

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



  //Custom function that we are going to export to JS
   @ReactMethod
   public void getDeviceName(Callback cb) {
       try{
           cb.invoke(null, android.os.Build.MODEL);
       }catch (Exception e){
           cb.invoke(e.toString(), null);
       }
   }



}
