
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNDataUsageLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDataUsageLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public String getTotalDataUsage() {

    return ""+ ((float) Math.round((android.net.TrafficStats.getMobileRxBytes() / (1024 * 1024)) * 10) / 10) + " Total Bytes received " + ((float) Math.round((android.net.TrafficStats.getTotalRxBytes() / (1024 * 1024)) * 10) / 10) ;

  }

  @Override
  public String getName() {
    return "RNDataUsageLibraryModule";
  }
}