package com.airbnb.android.react.maps;


import android.graphics.Bitmap;

import com.amazon.geo.mapsv2.model.BitmapDescriptor;

public interface ImageReadable {

  public void setIconBitmap(Bitmap bitmap);

  public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor);

  public void update();
}
