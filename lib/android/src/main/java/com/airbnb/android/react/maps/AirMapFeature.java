package com.airbnb.android.react.maps;

import android.content.Context;

import com.facebook.react.views.view.ReactViewGroup;
import com.amazon.geo.mapsv2.AmazonMap;

public abstract class AirMapFeature extends ReactViewGroup {
  public AirMapFeature(Context context) {
    super(context);
  }

  public abstract void addToMap(AmazonMap map);

  public abstract void removeFromMap(AmazonMap map);

  public abstract Object getFeature();
}
