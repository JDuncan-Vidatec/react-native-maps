package com.airbnb.android.react.maps;

import com.facebook.react.bridge.ReactApplicationContext;
import com.amazon.geo.mapsv2.AmazonMapOptions;

public class AirMapLiteManager extends AirMapManager {

  private static final String REACT_CLASS = "AIRMapLite";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  public AirMapLiteManager(ReactApplicationContext context) {
    super(context);
    this.googleMapOptions = new AmazonMapOptions().liteMode(true);
  }

}
